package org.Jeonom.day07.oop.run;

import java.util.Scanner;

import org.Jeonom.day07.oop.Book;
import org.Jeonom.day07.oop.Circle;
import org.Jeonom.day07.oop.Member;
import org.Jeonom.day07.oop.exercise.Rectangle;

// 실행용 클래스
public class Run {

	public static void main(String[] args) {
//		Run ex = new Run();
//		ex.oopPractice1();
		Run.oopPractice1();
		oopExercise();
//		Math.random();
	}
	
	
	public void constructorEx() {
		// 생성자 예제 엽습
//		Book book = new Book(); // 기본 생성자 이용해서 객체 생성
								// title, author는 모두 비어있음
//		book.title = "춘향뎐";
//		book.author = "작자미상";
		Book book = new Book("춘향뎐", "작자미상");
		Book emptyBook = new Book();
		
		Circle bintz = new Circle();
//		bintz.radius = 10;
		bintz.setRadius(10);
	}
	
	public static void oopPractice1() {
		// 문제1
		// 너비와 높이를 입력받아
		// 사각형의 넓이를 출력하는 클래스를 만드시오.
		// >> 4 5
		// 사각형의 넓이는 20입니다.
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print(">> ");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		double result = rect.getArea();
		System.out.println("사각형의 넓이는 " + result);
		System.out.println();
	}
	
	public static void oopExercise() {
		// 예제1.
		// Circle의 instance를 이용하여
		// 이름이 달덩이, 반지름은 5인
		// Circle의 넓이를 출력해보세요~
		Circle circle = new Circle();
		circle.name = "달덩이";
		circle.radius = 5;
		double area = circle.getArea(); // area라는 변수 선언
		System.out.println(area);		// 변수를 통해서 출력
		System.out.println(circle.name);
		System.out.println(circle.radius);
		System.out.println(circle.getArea()); // 메소드를 통해 출력
		
		Circle donut = new Circle(); // 클래스는 참조변수 선언할 때 한번만 사용
		donut.radius = 2;
		donut.name = "던킨도넛";
		area = donut.getArea();
		System.out.println(area);
	}
	
	public static void memberPractice() {
		System.out.println();
		// sc, member는 Stack 메모리, new 이하는 Heap 메모리에 할당
		Member member1 = new Member();
		member1.name = "일용자";
		member1.age = 33;
		member1.job = "의사";
		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;
		member2.job = "변호사";
		System.out.println(member1.name);
		System.out.println(member1.age);
		System.out.println(member1.job);
		System.out.println(member2.name);
		System.out.println(member2.age);
		System.out.println(member2.job);
	}
}
