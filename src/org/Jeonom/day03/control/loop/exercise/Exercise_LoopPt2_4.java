package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_LoopPt2_4 {
	public static void main(String[] args) {
		// 4번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 5
		 *****
		 *   *
		 *   *
		 *   *
		 *****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for(int i = 0; i <= input; i++) {
			for(int j = input-1; j > i; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
