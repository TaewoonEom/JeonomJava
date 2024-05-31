package miniproject;

import java.util.Scanner;

public class Result {
	Viewmenu view = new Viewmenu();
	
	public int recommendCoffee(int firstChoice, int secondChoice) {
		Scanner sc = new Scanner(System.in);
		switch(firstChoice) {
		case 1 :
			firstSour(secondChoice);
			break;
		case 2 :
			secondNutty(secondChoice);
			break;
		case 3 : 
			thirdBitter(secondChoice);
			break;
		case 4 : 
			fourthSweet(secondChoice);
			break;
		default :
			view.sendMessage("※ 정확한 숫자를 입력해주세요!!! ※");
		}
		return sc.nextInt();
	}
	
	public void firstSour(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'과테말라 안티구아'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '쌉쌀한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'에티오피아 예가체프'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'케냐AA'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		}
	}
	public void secondNutty(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'콜롬비아 수프리모'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '쌉쌀한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'레트로'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'레트로 브라비'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		}
	}
	public void thirdBitter(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'테라'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'오닉스'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'시티 브라운'을 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		}
	}
	public void fourthSweet(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'테라 돌체'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'그랑 다비드'를 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '쌉쌀한 맛'을 2순위로 선택하셨습니다.");
			System.out.println("'에버스윗'을 추천합니다~!");
			System.out.println("1. 정보보기");
			System.out.println("2. 다시하기");
			System.out.print("선택 : ");
			break;
		}
	}
	
}
