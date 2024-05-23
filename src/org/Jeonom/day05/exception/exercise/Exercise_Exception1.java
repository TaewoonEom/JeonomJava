package org.Jeonom.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		// 문제1
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를
		// 출력하고 다시 입력받는 프로그램을 작성하여라.
		
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int num1, num2 = 0;
			int result = 0;
			try {
				System.out.print("1번째 정수 입력 : ");
				num1 = sc.nextInt();
				System.out.print("2번째 정수 입력 : ");
				num2 = sc.nextInt();
				result = num1 / num2;
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			}
			
			System.out.printf("%d을 %d으로 나누면 몫은 %d입니다\n", num1, num2, result);
		}
	}
}
