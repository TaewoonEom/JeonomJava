package miniproject;

import java.util.Scanner;

public class FlavorChoice {
	
	public int firstFlavor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 원두를 추천해드립니다~! ===");
		System.out.println("선호하는 맛(1순위)을 골라주세요!");
		System.out.println("1. 신맛");
		System.out.println("2. 고소한맛");
		System.out.println("3. 쌉쌀한맛");
		System.out.println("4. 단맛");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	public int secondFlavor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("선호하는 맛(2순위)을 골라주세요!");
		System.out.println("1. 신맛");
		System.out.println("2. 고소한맛");
		System.out.println("3. 쌉쌀한맛");
		System.out.println("4. 단맛");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
}
