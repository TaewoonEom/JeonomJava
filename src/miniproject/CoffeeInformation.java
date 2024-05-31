package miniproject;

import java.util.Scanner;

public class CoffeeInformation {
	Viewmenu view = new Viewmenu();
	
	public int showInformation(int firstChoice, int secondChoice) {
		Scanner sc = new Scanner(System.in);
		switch(firstChoice) {
		case 1 :
			sourCoffee(secondChoice);
			break;
		case 2 :
			nuttyCoffee(secondChoice);
			break;
		case 3 : 
			bitterCoffee(secondChoice);
			break;
		case 4 : 
			sweetCoffee(secondChoice);
			break;
		default :
			view.sendMessage("※ 정확한 숫자를 입력해주세요!!! ※");
		}
		return sc.nextInt();
	}
	
	public void sourCoffee(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'과테말라 안티구아'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'에티오피아 예가체프'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'케냐AA'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		}
	}
	public void nuttyCoffee(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'콜롬비아 수프리모'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'레트로'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'레트로 브라비'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		}
	}
	public void bitterCoffee(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'테라'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'오닉스'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'시티 브라운'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		}
	}
	public void sweetCoffee(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'테라돌체'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'그랑 다비드'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("정보보기를 선택하셨습니다.");
			System.out.println("'에버스윗'에 대한 정보~~");
			System.out.println("1. 다시하기");
			System.out.print("입력 : ");
			break;
		}
	}

}
