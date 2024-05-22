package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_LoopPt2_6 {
	public static void main(String[] args) {
		// 6번
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();
			
			if (input < 2) System.out.println("잘못 입력하셨습니다.");
			
			if ((input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0)
				&& (input == 2 || input == 3 || input == 5 || input == 7)) 
				{
				System.out.println("소수가 아닙니다.");
			}
			else {
				System.out.print("소수입니다.");		
			}		
		} while (input < 2);
		
	}
}
