package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될 때까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(-1을 입력하면 이전까지 입력한 수의 합이 출력됩니다.) : ");
		int input = sc.nextInt();
		int sum = 0;
		while(input != -1) {
			sum += input;
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
		}
			System.out.println("입력한 수의 합은 : " + sum);
	}

//	*나중에 Spring 쓸 때 사용함*
//		int lastNum;
//		System.out.print("정수 하나 입력 : ");
//		while((lastNum = sc.nextInt()) != -1) {
//			sum += lastNum;
//		}
	
//	*break문 사용하는 방법*
//		while(true) {
//			System.out.print("정수 하나 입력 : ");
//			input = sc.nextInt();
//			if(input == -1) break;
//			sum += input;
//	}

			
//	*정수를 10번 입력받아서 합을 출력하는 프로그램*
//		int sum = 0;
//		int i = 0;
//		while(i < 10) {
//			System.out.print("정수 하나 입력 : ");
//			int input = sc.nextInt();
//			sum += input;
//			i++;
//		}
//			System.out.println("총합 : " + sum);

}
