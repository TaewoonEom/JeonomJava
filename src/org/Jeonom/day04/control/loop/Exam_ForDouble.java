package org.Jeonom.day04.control.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
		// 중첩 for문 - for문 안의 for문
		// 문법
		// for ( ) { for ( ) { } }
		// 복합대입연산자
		// i = i + 1;
		// i++;
		// -> i += 1;
		// i = i * 2;
		// -> i *= 2;
		// i = i + 2;
		// -> i += 2;
		
		for(int i = 2; i < 10; i++) {
			// 1. j는 2일 때 시작해서
			// 2. 안에 있는 for문으로 2단 출력
			// 4. j는 3이 되어서
			// 5. 안에 있는 for문으로 3단 출력
			// 7. j는 4가 되어서
			// 8. 안에 있는 for문으로 4단 출력
			// 10. 조건식이 false가 되므로 중첩 for문 동작 끝(4단까지의 경우)
			System.out.println();
			for(int j = 1; j < 10; j++) {
				// 2단 출력중
				System.out.println(i + " * " + j + " = " + i*j);
			}
			// 3. 2단 출력이 모두 끝나면 바깥 for문에 증가식 동작
			// 6. 3단 출력 끝, 끝나면 바깥 for문에 증가식 동작
			// 9. 4단 출력 끝, 끝나면 바깥 for문에 증가식 동작
		}
		
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
		
//		System.out.println("3 * 1 = 3");
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 4 = 12");
//		System.out.println("3 * 5 = 15");
//		System.out.println("3 * 6 = 18");
//		System.out.println("3 * 7 = 21");
//		System.out.println("3 * 8 = 24");
//		System.out.println("3 * 9 = 27");
	}
}
