package org.Jeonom.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	// 멤버필드
	int kor;
	int eng;
	int math;
	
	// 생성자
	public ManageStudent() {}
	
	public void inputScore() { 
		System.out.println("====== 성적 입력 ======");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}

	
	public void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.printf("평균 : %.1f\n", (kor + eng + math) / 3.0);
	}
}
	
	
