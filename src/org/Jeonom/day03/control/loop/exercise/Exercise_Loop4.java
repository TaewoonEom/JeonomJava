package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	public static void main(String[] args) {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("서로 다른 두 개의 숫자를 입력해주세요");
		System.out.print("첫 번째 숫자를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		int max = 0;
		int min = 0;
		int i = 0;
		
		if (num1 < 1 || num2 < 1) System.out.print("1 이상의 숫자를 입력해주세요");
		if (num1 == num2) System.out.print("서로 다른 숫자를 입력해주세요");
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		for (i = min + 1; i < max; i++) {
			System.out.print(i + " ");
		}
		
	}
}
