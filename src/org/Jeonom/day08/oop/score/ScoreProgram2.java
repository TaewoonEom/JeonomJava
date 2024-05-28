package org.Jeonom.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	static int kor;
	static int eng;
	static int math; // ScoreProgram2 클래스의 멤버필드
	// 변수를 main 함수 안에 넣으면 메소드 안에서는
	// 작동하지 않기 때문에 바깥으로 빼준 것
	// static 메소드에서는 non static 멤버에 접근할 수 없다!
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		finish :
		while(true) {
			int choice = printMenu(); // method를 통해 int choice값을 리턴받음
			switch(choice) {
			case 1 :
				inputScore();
				break;
			case 2 :
				printScore();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break finish;
			default :
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	private static void displayMsg(String message) { // 매개변수 있는경우
		// message = "프로그램을 종료합니다.";
		// message = "1 ~ 3 사이의 수를 입력해주세요.";
		System.out.println(message);
	}
	// ScoreProgram2 클래스의 멤버메소드
	private static void printScore() { // static
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.printf("평균 : %.1f\n", (kor + eng + math) / 3.0);
	}
	
	private static void inputScore() { // static
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static int printMenu() { // static
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
}
