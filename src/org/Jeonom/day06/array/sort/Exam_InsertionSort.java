package org.Jeonom.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String [] args) {
		// 삽입정렬이란?
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 n-1번에서 0번까지 비교~!
		// n은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 5자리랑 있는 값 비교
		// i = 1
		// j = 0
		// arrs[1]과 arrs[0] 비교
		// arrs[0]이 크면 교환		// {2, 5, 4, 1, 3}
		// i = 2
		// j = 0, 1
		// arrs[2]와 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[2]와 arrs[0] 비교
		// arrs[0]이 크면 교환		// {2, 4, 5, 1, 3}
		// i = 3
		// j = 0, 1, 2
		// arrs[3]과 arrs[2] 비교
		// arrs[2]가 크면 교환
		// arrs[3]과 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[3]과 arrs[0] 비교
		// arrs[0]이 크면 교환		// {1, 2, 4, 5, 3}
		// i = 4
		// j = 0, 1, 2, 3
		// arrs[4]과 arrs[3] 비교
		// arrs[3]이 크면 교환
		// arrs[4]과 arrs[2] 비교
		// arrs[2]가 크면 교환
		// arrs[4]과 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[4]과 arrs[0] 비교
		// arrs[0]이 크면 교환		// {1, 2, 3, 4, 5}
		
		int arrs[] = { 2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j >= 1; j--) {
				if(arrs[j-1] > arrs[j]) {	// 설명과 다르게 i가 아닌 j인 이유
											// 교환이 일어난 후 같은값으로 비교하기 위해서임
											// 교환이 일어났으면 index의 값이 -1된다.
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}
		}
		// 정렬된 결과 출력
		for(int num : arrs) {
			System.out.print(num + " ");
		}
			// 5하고 2비교, i가 1일때 
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
			// 4하고 5비교, i가 2일때
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[0] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[0];
//				arrs[0] = temp;
//			}
			// 1하고 4비교, 1하고 5비교, 1하고 2비교
			// i가 3일때
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
//			if(arrs[1] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[0] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[0];
//				arrs[0] = temp;
//			}
		
	}
}
