package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_LoopPt2_7 {
	public static void main(String[] args) {
		// 7번
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		if (input < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			for (int i = 2; i <= input; i++) {
				if ((i % 2 != 0 || i % 3 != 0 || i % 5 != 0 || i % 7 != 0)
						|| (i == 2 || i == 3 || i == 5 || i == 7)) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
}
