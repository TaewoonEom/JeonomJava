package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {
	public static void main(String[] args) {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.   
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) System.out.print(i + " + ");
			else System.out.print(i + " = ");
		}
		System.out.println(sum); // 출력방법1
		System.out.println("총합 : " + sum); //출력방법2
		System.out.println("1부터 " + num + "까지 숫자들의 합은 " + sum); // 출력방법3
		System.out.printf("1부터 %d까지의 합 : %d\n", num, sum); // 출력방법4
	}
}
