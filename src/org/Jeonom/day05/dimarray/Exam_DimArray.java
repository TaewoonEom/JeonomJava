package org.Jeonom.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0; // 변수
		int nums[] = new int[10]; // 배열
		int dimNums[][] = new int[2][5]; // 2차원 배열
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
		
		int arrs[][] = new int[4][4];
		int k= 1;
		// 2차원 배열 값 입력하기
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " ");
			}
			System.out.println();
		}
		
		//  for-each로 출력
		// arrs 배열에 arr[] 값을 넣고 arr 배열 안에 j값을 넣는다.
		for(int arr[] : arrs) {
			for(int j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[1][0] = 5;
//		arrs[1][1] = 6;
//		.
//		.
//		.
	}
}
