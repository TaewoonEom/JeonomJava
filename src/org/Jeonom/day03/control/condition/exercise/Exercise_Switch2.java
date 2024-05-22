package org.Jeonom.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch2 {
	public static void main(String [] args) {
		// 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		// 점수를 입력해주세요 : 102
		// 0 ~ 100 사이의 수를 입력해주세요
		// 커트라인 (100 ~ 90 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~60 : D, 그 외 F)
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해주세요(0 ~ 100) : ");
		int score = scanner.nextInt();
		char grade = 0;
		
		switch (score/10) {
			case 10 :
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
	}
}
