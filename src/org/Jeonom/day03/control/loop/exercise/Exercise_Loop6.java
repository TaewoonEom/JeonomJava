package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {
	public static void main(String[] args) {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요(2 ~ 9) : ");
		int dan = sc.nextInt();
		
		if (dan > 9) {
			System.out.print("9 이하의 숫자만 입력해주세요");
		}
		else {
			System.out.println(dan + "단부터 9단까지 출력합니다.");
			for(int i = dan; i < 10; i++) {
				System.out.println("-" + i + "단-");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
			}
		}
		
	}
}
