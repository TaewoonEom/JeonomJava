package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {
	public static void main(String[] args) {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력(1 이상의 숫자 입력) : ");
		int input = sc.nextInt();
		
		while (input > 0) {
				System.out.print(input + " ");
				input--;
			}
		
		/*
		 * if(input >= 1) {
		 *  	for(int i = input; i >= 1; i--) {
		 *  		System.out.print(i + " ");
		 *  	}
		 * }
		 */
		}
	}
