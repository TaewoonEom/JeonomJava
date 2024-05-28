package org.Jeonom.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop {
	
	public void For1() {
		// 정수 하나를 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
				// 그 수의 구구단을 출력하세요.
				// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를
				// 출력하세요.
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 하나 입력 : ");
				int dan = sc.nextInt();
				
				if (dan < 1 || dan > 9) {
					System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다.");
				}
				else {
					System.out.println("-- " + dan + "단 --");
					for(int i = 1; i < 10; i++) {
						System.out.println(dan + " * " + i + " = " + dan*i);
					}
				}
			}
	public void For2() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			// sum = sum + i;
			sum += i;
			if (i <= 9) {
				System.out.print(i + " + ");
			}
			else System.out.print(i + " = ");
		}
		System.out.println(sum);
	}
	public void Exercise1() {
		//1번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 
		//숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력(1 이상의 숫자 입력) : ");
		int input = sc.nextInt();
		int i;
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		else {
			for(i = 1; i <= input; i++) {
				if (i == input) {
					System.out.print(i);
				}
				else {
					System.out.print(i + ", ");
				}			
			}
		}
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		do {
//			System.out.print("정수 한개 입력(1 이상의 숫자 입력) : "); // 정수 1개를 입력받음
//			num = sc.nextInt();
//			
//			if (num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요!");
//			}
//			else {
//				for(int i = 1; i <= num; i++) {
//						System.out.print(i + " ");
//					}
//			}
//		} while (num < 1);
	}
	public void Exercise2() {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력(1 이상의 숫자 입력) : ");
		int input = sc.nextInt();
		
		while (input > 0) {
				System.out.print(input + " ");
				input--;
			}
		
		/*
		 * if(input >= 1) {
		 *  	for(int i = input; i >= 1; i--) {
		 *  		System.out.print(i + " ");
		 *  	}
		 * }
		 */
	}
	public void Exercise3() {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.   
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) System.out.print(i + " + ");
			else System.out.print(i + " = ");
		}
		System.out.println(sum); // 출력방법1
		System.out.println("총합 : " + sum); //출력방법2
		System.out.println("1부터 " + num + "까지 숫자들의 합은 " + sum); // 출력방법3
		System.out.printf("1부터 %d까지의 합 : %d\n", num, sum); // 출력방법4
	}
	public void Exercise4() {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("서로 다른 두 개의 숫자를 입력해주세요");
		System.out.print("첫 번째 숫자를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		int max = 0;
		int min = 0;
		int i = 0;
		
		if (num1 < 1 || num2 < 1) System.out.print("1 이상의 숫자를 입력해주세요");
		if (num1 == num2) System.out.print("서로 다른 숫자를 입력해주세요");
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}		
		for (i = min + 1; i < max; i++) {
			System.out.print(i + " ");
		}
	}
	public void Exercise5() {
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요(2 ~ 9) : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);			
		}
	}
	public void Exercise6() {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요(2 ~ 9) : ");
		int dan = sc.nextInt();
		
		if (dan > 9) {
			System.out.print("9 이하의 숫자만 입력해주세요");
		}
		else {
			System.out.println(dan + "단부터 9단까지 출력합니다.");
			for(int i = dan; i < 10; i++) {
				System.out.println("-" + i + "단-");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
			}
		}
	}
	public void Exercise2_1() {
		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("1) 2와 3의 배수 : ");
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("2) 2와 3의 공배수 : ");
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	public void Exercise2_2() {
		// 2번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for(int i = 0; i <= input; i++) {
			for(int j = input-1; j > i; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	public void Exercise2_3() {
		// 3번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 4
		 *
		 ***
		 *****
		 *******
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void Exercise2_4() {
		// 4번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 5
		 *****
		 *   *
		 *   *
		 *   *
		 *****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				if(i == 0 || i == input-1) {
					System.out.print("*");
				}
				else {
					if (j == 0 || j == input-1) {
						System.out.print("*");
					} else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void Exercise2_5() {
		// 5번
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else if (input == 2 || input == 3 || input == 5 || input == 7) {
			System.out.println("소수입니다.");
		}
		else if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0) {
				System.out.println("소수가 아닙니다.");
		}
		else {
			System.out.print("소수입니다.");		
		}
	}
	public void Exercise2_6() {
		// 6번
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();
			
			if (input < 2) System.out.println("잘못 입력하셨습니다.");
			
			if ((input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0)
				&& (input == 2 || input == 3 || input == 5 || input == 7)) 
				{
				System.out.println("소수가 아닙니다.");
			}
			else {
				System.out.print("소수입니다.");		
			}		
		} while (input < 2);
	}
	public void Exercise2_7() {
		// 7번
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		if (input < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			for (int i = 2; i <= input; i++) {
				if (i == 2 || i == 3 || i == 5 || i == 7) {
					System.out.print(i + " ");
				} else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
					System.out.print(i + " ");
				} else continue;
			}
		}
	}
	public void While1() {
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		int i = 1;
		int sum = 0;
		while(i < 100) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
			/*1.
			 * while(i < 50) {
			 * 		sum += (2*i)+1;
			 * 		i++;
			 */
		
			/* 2.
			 * while(i < 100) {
			 * 		sum += i;
			 * 		i += 2;
			 * }
			 */ 
		
			/* 3.
			 * i = 0;
			 * while(++i < 100) {
			 * if(i % 2 == 1) sum += i;
			 * }
			 */
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
	public void While2() {
		// While문을 이용하여 -1이 입력될 때까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(-1을 입력하면 이전까지 입력한 수의 합이 출력됩니다.) : ");
		int input = sc.nextInt();
		int sum = 0;
		while(input != -1) {
			sum += input;
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
		}
			System.out.println("입력한 수의 합은 : " + sum);
			
//			*나중에 Spring 쓸 때 사용함*
//			int lastNum;
//			System.out.print("정수 하나 입력 : ");
//			while((lastNum = sc.nextInt()) != -1) {
//				sum += lastNum;
//			}
		
//			*break문 사용하는 방법*
//			while(true) {
//				System.out.print("정수 하나 입력 : ");
//				input = sc.nextInt();
//				if(input == -1) break;
//				sum += input;
//			}

				
//			*정수를 10번 입력받아서 합을 출력하는 프로그램*
//			int sum = 0;
//			int i = 0;
//			while(i < 10) {
//				System.out.print("정수 하나 입력 : ");
//				int input = sc.nextInt();
//				sum += input;
//				i++;
//				}
//			System.out.println("총합 : " + sum);
	}
}
