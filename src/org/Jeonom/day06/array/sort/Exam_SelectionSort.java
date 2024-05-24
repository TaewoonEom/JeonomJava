package org.Jeonom.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함.
		// {2, 5, 4, 1, 3} : 2를 최소값으로 가정, 값을 비교해 더 작은 수가 있으면 교환
		// 첫번째 결과 : {1, 5, 4, 2, 3}
		// {1, 5, 4, 2, 3} : 5를 최소값으로 가정, 값을 비교해 더 작은 수가 있으면 교환
		// 두번째 결과 : {1, 2, 4, 5, 3}
		// {1, 2, 4, 5, 3}
		// 세번째 결과 : {1, 2, 3, 5, 4}
		// {1, 2, 3, 5, 4}
		// 네번째 결과 : {1, 2, 3, 4, 5}
		int arrs[] = {2, 5, 4, 1, 3};
		for(int i = 0; i < 5; i++) {
			int min = i;
//			for(int j = i; j >= 0; j--) {
			for(int j = i+1; j < 5; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;	// 최소값이 정해졌을 때 arrs[min]은 최소값
								// 인덱스를 기억하기 위해 min 변수 사용
								// 비교할 때 자리가 여러번 교환되는 경우도 있기 때문에
								// 한번 더 자리가 바뀌기 전의 min값을 저장해 놓는다.
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		// 정렬된 결과 출력
		for(int num : arrs) {
			System.out.print(num + " ");
		}
				
//				if(arrs[0] > arrs[1]) {
//					// 니가 최소값이야
//				}
//				if(arrs[0] > arrs[2]) {
//					// 니가 최소값이야
//				}
//				if(arrs[0] > arrs[3]) {
//					// 니가 최소값이야
//				}
//				if(arrs[0] > arrs[4]) {
//					// 니가 최소값이야
//				}
//				int temp = arrs[0];
//				arrs[0] = 최소값;
//				최소값의 자리 = temp;
//				
//				if(arrs[1] > arrs[2]) {
//					// 니가 최소값이야
//				}
//				if(arrs[1] > arrs[3]) {
//					// 니가 최소값이야
//				}
//				if(arrs[1] > arrs[4]) {
//					// 니가 최소값이야
//				}
//				int temp = arrs[1];
//				arrs[1] = 최소값;
//				최소값의 자리 = temp;
//				
//				if(arrs[2] > arrs[3]) {
//					// 니가 최소값이야
//				}
//				if(arrs[2] > arrs[4]) {
//					// 니가 최소값이야
//				}
//				int temp = arrs[2];
//				arrs[2] = 최소값;
//				최소값의 자리 = temp;
//				
//				if(arrs[3] > arrs[4]) {
//					// 니가 최소값이야
//				}
//				int temp = arrs[3];
//				arrs[3] = 최소값;
//				최소값의 자리 = temp;
	}
}
