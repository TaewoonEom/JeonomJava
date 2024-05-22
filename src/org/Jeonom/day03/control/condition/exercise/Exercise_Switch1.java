package org.Jeonom.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
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
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		
		switch (menu) {
			case "에스프레소" :
				System.out.println("2500원입니다.");
				break;
			case "아메리카노" :
				System.out.println("3000원입니다.");
				break;
			case "카페라떼" :
				System.out.println("3500원입니다.");
				break;
			case "카푸치노" :
				System.out.println("4000원입니다.");
				break;
			default :
				System.out.println("없는 메뉴입니다.");
		}
	}
		
}

