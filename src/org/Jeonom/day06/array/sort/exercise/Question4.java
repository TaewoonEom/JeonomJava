package org.Jeonom.day06.array.sort.exercise;

import java.util.Random;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		// 출력까지는 완료했으나 난수에서 중복된 값이 생성되지 않게
		// 하는 방법은 모르겠음ㅠ
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		if (input < 1) {
			System.out.print("배열의 크기는 양수로 입력해야 합니다!");
		} else {
			int inputArray[] = new int[input];
			int randNums = (int)(Math.random()*100)+1;
			for(int i = 0; i < input; i++) {
				inputArray[i] = randNums;
				
				sum += randNums;
			}
		}
		System.out.print("sum = " + sum);
	}
}
