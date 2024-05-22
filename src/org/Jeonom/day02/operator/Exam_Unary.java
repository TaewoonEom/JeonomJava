package org.Jeonom.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		// ++a : 전위연산자(먼저 연산 후 출력)
		// a++ : 후위연산자(먼저 출력 후 연산)
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는 30입니다.
		// a++;
		// b = (--a) + b;
		// c = (a++) + (--b);
		// a, b, c의 값은 얼마일까요?
		// a = 11, b = 29, c = 39
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		// a = 11;
		b = (--a) + b; // 10 + 20
		// a = 10, b = 30;
		c = (a++) + (--b); // 10 + 29
		// a = 11, b = 29, c = 39
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		// 문제2
		// x는 100, y는 33, z는 0
		// x--;
		// z = x-- + --y;
		// x = 99 + x++ + x;
		// x = y-- + y + ++y;
		// x, y, z의 값은 얼마일까요?
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		// x = 99;
		z = x-- + --y; // 99 + 32
		// x = 98, y = 32, z = 131;
		x = 99 + x++ + x; // 99 + 98 +99
		// x = 296, y = 32, z = 131;
		y = y-- + y + ++y; // 32 + 31 + 32
		// x = 296, y = 95, z = 131;
		
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}

}
