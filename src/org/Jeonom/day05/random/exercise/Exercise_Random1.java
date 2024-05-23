package org.Jeonom.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		// 동전 앞뒤 맞추기!
		// === 동전 앞 뒤 맞추기 ===
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 맞췄습니다.
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			int num = (int)(Math.random()*2)+1;
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
			int choice = sc.nextInt();
//			int num = rand.nextInt(2)+1; // 1 ~ 2 사이의 랜덤한 수
			
			if (choice == -1) break;
			if (choice == num) {
				System.out.print("맞췄습니다.");
			}
			else {
				System.out.print("틀렸습니다.");
			}
			System.out.println();
		}
		
	}
}
