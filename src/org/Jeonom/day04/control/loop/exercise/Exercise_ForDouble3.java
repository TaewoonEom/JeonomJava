package org.Jeonom.day04.control.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단 세로로 출력
		
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 5; dan++) {
				System.out.print(dan + " * " + i + " = " + dan*i + "\t");
				// "\t" = tab 기능
			}
			System.out.println();
		}
	}
}
