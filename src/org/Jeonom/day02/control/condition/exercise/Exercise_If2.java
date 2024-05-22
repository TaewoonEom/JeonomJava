package org.Jeonom.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소 2500, 카푸치노 4000, 카페라떼 3500, 아메리카노 3000)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원입니다.
		// 메뉴를 입력하세요 : 자바칩프라푸치노
		// 없는 메뉴입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		int price = 0;
		
		// 문자열 비교는 ==이 안됨. 문자열 비교는 equals.()
		if (menu.equals("에스프레소")) {
			price = 2500;
			// System.out.println("2,500원 입니다.");
		}
		else if (menu.equals("아메리카노")) {
			price = 3000;
			// System.out.println("3,000원 입니다.");
		}
		else if (menu.equals("카페라떼")) {
			price = 3500;
			// System.out.println("3,500원 입니다.");
		}
		else if (menu.equals("카푸치노")) {
			price = 4000;
			// System.out.println("4,000원 입니다.");
		}
		else {
			// System.out.println("없는 메뉴입니다.");
		}
		System.out.println(price + "원입니다.");
	}

}