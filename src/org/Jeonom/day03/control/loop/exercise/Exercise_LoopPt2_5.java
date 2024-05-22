package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_LoopPt2_5 {
	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else if (input == 2 || input == 3 || input == 5 || input == 7) {
			System.out.println("소수입니다.");
		}
		else if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0) {
				System.out.println("소수가 아닙니다.");
		}
		else {
			System.out.print("소수입니다.");		
		}
		
	}
}
