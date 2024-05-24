package org.Jeonom.day06.array.sort.exercise;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1 || input > 100) {
			System.out.print("1부터 100 사이의 정수를 입력하세요!");
		} else if (input == 1) {
			System.out.print("1은 소수가 아닙니다.");
		} else {
			if (input == 2 || input == 3 || input == 5 || input == 7) {
				System.out.println(input + "은(는) 소수입니다.");
			} else if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0) {
					System.out.println(input + "은(는) 소수가 아닙니다.");
			} else {
				System.out.print(input + "은(는) 소수입니다.");	
			}
		}
	
	}
}
