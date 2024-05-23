package org.Jeonom.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String[] args) {
		// 문제2
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는
		// InputMisamtchException 예외를 처리하여 다시 입력받도록
		// 정수 3개를 입력하세요.
		// 11 2 3
		// 합은 16
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			try {
				sum += sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				i--; // 오류가 나도 입력받기 전으로 돌아가 다시 입력할 수 있도록 함
			}
		}
		System.out.printf("합은 %d\n", sum);
		
//		for (;;) {
//			int num1, num2, num3 = 0;
//			int result = 0;
//			try {
//				System.out.print("1번째 정수 입력 : ");
//				num1 = sc.nextInt();
//				System.out.print("2번째 정수 입력 : ");
//				num2 = sc.nextInt();
//				System.out.print("3번째 정수 입력 : ");
//				num3 = sc.nextInt();
//				System.out.printf("%d %d %d\n", num1, num2, num3);
//				result = num1 + num2 + num3;
//			} catch(InputMismatchException e) {
//				System.out.println("문자를 입력하셨습니다. 정수를 입력해주세요!");
//				sc.next(); 
//				continue;
//			}
//			
//			System.out.printf("합은 %d\n", result);
//		}
		
	}

}
