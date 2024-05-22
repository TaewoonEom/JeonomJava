package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_LoopPt2_1 {
	public static void main(String[] args) {
		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("1) 2와 3의 배수 : ");
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("2) 2와 3의 공배수 : ");
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
