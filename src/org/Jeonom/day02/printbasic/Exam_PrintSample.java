package org.Jeonom.day02.printbasic;

public class Exam_PrintSample {
	public static void main (String [] args) {
		System.out.println("이것이 원래 쓰던거");
		System.out.print("이게 조금 다른거\n"); // 개행이 없어서 \n
		
		// 형식문자
		// 1. 정수 : %d
		// 2. 실수 : %f
		// 3. 문자 : %c
		// 4. 문자열 : %s
		System.out.printf("정수 출력 : %d, 문자열 출력 : %s\n", 1023, "일공이삼");
		// printf는 개행 기능이 없어서 \n 추가
		System.out.println("이제 끝~!");
		System.out.printf("개강날짜 : %.1f, 종강날짜 : %.2f\n", 5.7, 10.23);
		// %f 사이에 .숫자를 넣어서 출력할 소숫점 자리수를 정할 수 있다.
	}
}
