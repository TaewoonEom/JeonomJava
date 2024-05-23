package org.Jeonom.day05.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"
		// 다시 입력 받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		
		while (true) { // for(;;) 와 동일함
			int result = 0;
			int num1 = 0, num2 = 0;
			try {
				System.out.print("첫번째 정수 입력 : ");
				num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				num2 = sc.nextInt();
				result = num1 / num2;
			}catch(ArithmeticException e) {
				// e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨습니다!");
				sc.next();  // sc.next(); 가 없으면 try부분에서 입력된 문자가 처리되지 않아서
				   		    // 이후에도 문자가 계속 입력됨 -> 계속 반복.
				   		   // catch문 안에 어느 위치에 있던지 continue보다 먼저 실행되기만 하면 됨!
				continue;
			}
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);
		}
		
	}
}
