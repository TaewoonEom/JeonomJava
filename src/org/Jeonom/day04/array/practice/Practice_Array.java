package org.Jeonom.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {
	
	public void practice1() {
		// 1번
				// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
				// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
				int array[] = new int[10];
				
				for(int i = 0; i < 10; i++) {
					array[i] = i+1;
					System.out.print(array[i] + " ");
				}
	}
	public void practice2() {
		// 2번
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		// ex.
		// 10 9 8 7 6 5 4 3 2 1
		int array[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			array[i] = 10-i;
			System.out.print(array[i] + " ");
		}
	}
	public void practice3() {
		// 3번
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		// ex.
		// 양의 정수 : 5
		// 1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int input = sc.nextInt();
		int array[] = new int[input];
		
		for (int i = 0; i < input; i++) {
			array[i] = i+1;
			System.out.print(array[i] + " ");
		}
	}
	public void practice4() {
		// 4번
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 
		//초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		// ex.
		// 귤
		String fruits[] = {"사과", "귤", "포도", "복숭아", "참외"};
//				input[0] = "사과";
//				input[1] = "귤";
//				input[2] = "포도";
//				input[3] = "복숭아";
//				input[4] = "참외";
//				System.out.print(fruits[1]);
		
		for(int i = 0; i <fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
	}
	public void practice5() {
		// 5번
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		// ex.
		// 문자열 : application
		// 문자 : i
		// application에 i가 존재하는 위치(인덱스) : 4 8
		// i 개수 : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = sc.next();
		// 입력받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		int count = 0;
		int size = object.length();   // "문자열".length()하면 안에 문자열의 길이가 구해짐
		char word[] = new char[size]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함
	
		for (int i = 0; i < size; i++) {
			word[i] = object.charAt(i); // "문자열".charAt(0) 하면 '문' 출력
		}
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		System.out.print(object + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < word.length; i++) { // 배열.length 하면 배열의 크기가 구해짐
			if(word[i] == search) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(search + " 개수 : " + count);
		

		// 내가 혼자 만든 것
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 : ");
//		String letter = sc.next();
//		int size = letter.length();
//		char words[] = new char[size];
//		
//		for(int i = 0; i < size; i++) {
//			words[i] = letter.charAt(i);
//		}
//				
//		int count = 0;
//		System.out.print("문자 : ");
//		char find = sc.next().charAt(0);
//		System.out.print(letter + "에 " + find + "가 존재하는 위치(인덱스) : " );
//		for(int i = 0; i < size; i++) {
//			if (words[i] == find) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.print(find + "개수 : " + count);
	}
	public void practice6() {
		// 6번
		// “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		// ex.
		// 0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
		// 금요일 잘못 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 부터 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
				
		if (input < 0 || input > 6) {
			System.out.println("잘못 입력하셨습니다.");	
		}
		else {
			char day[] = {'월', '화', '수', '목', '금', '토', '일'};
			System.out.println(day[input] + "요일");
		}
	}
	public void practice7() {
		// 7번
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int array[] = new int[input];
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		for(int i = 0; i < input; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("총합 : " + sum); 
	}
	public void practice8() {
		// 8번
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//
//		ex.
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("3 이상인 홀수 자연수를 입력하세요 : ");
			input = sc.nextInt();
			
			if (input < 3 || input % 2 == 0 || input < 1) {
				System.out.println("다시 입력하세요!");
			}
		} while (input < 3 || input % 2 == 0 || input < 1);
		
		int array[] = new int[input];
		int middle = input / 2;
		int num = 1;
		
		for(int i = 0; i < middle; i++) {
			array[i] = num++;		// num++이 후위식이기 때문에 조건식을 충족하지 못해도+
									// +1된 값이 for문을 빠져나와서 밑에 있는 for문에 그대로 넣어진다.
		}							// array[0] = 1 부터 array[middle-1] = middle까지 오름차순으로 값이 저장
		for(int i = middle; i <= input-1; i++) { 
			array[i] = num--;		// 조건식에서 i는 array배열의 인덱스 값이기 때문에
									// input-1의 값까지 증가해야 num-1의 값을 넣을 수 있다.
		}							// array[middle] = middle
		for(int i = 0; i < input; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public void practice9() {
		// 9번
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//
//		ex.
//		치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
		Scanner sc = new Scanner(System.in);
		
		String menu[] = {"황금올리브", "뿌링클", "허니콤보", "고추바사삭", "맵슐랭"};
		
		while(true) {
			System.out.print("메뉴를 검색해주세요 : ");
			String name = sc.next();
			
			switch (name) {
				case "황금올리브" : 
				case "뿌링클" : 
				case "허니콤보" : 
				case "고추바사삭" : 
				case "맵슐랭" : 
					System.out.println(name + " 배달 가능");
				break;
				default :
					System.out.println(name + " 없는 메뉴입니다.");
			}
		}
	}
	public void practice10() {
		// 10번
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char idNums[] = new char[idNum.length()];
		for(int i = 0; i < idNum.length(); i++) {
			idNums[i] = idNum.charAt(i);
		}
		
		// 깊은 복사 사용 버전
		char copy[] = new char[idNum.length()];
		for(int i = 0; i < idNums.length; i++) {
			copy[i] = idNums[i];
			if(i < 8) {
				copy[i] = idNums[i];
			}
			else {
				copy[i] = '*';
			}
		}
		for(char num : copy ) {
			System.out.print(num);
		}
	}
	public void practice11() {
		// 11번
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//
//		ex.
//		3 4 15 17 28 40
		int ranNums[] = new int[6];
		int ranNum = 0;
		
		// 랜덤값을 배열에 넣음
		for(int i = 0; i < ranNums.length; i++) {
			ranNum = (int)(Math.random()*45)+1;
			ranNums[i] = ranNum;
		}
		// 배열의 값을 비교-> 중복값 제거 -> 정렬 -> 출력
		for(int i = 1; i <ranNums.length; i++) {
			for(int j = i; j >= i; j--)
			if (ranNums[j-1] == ranNums[j]) {
				ranNums[j] = (int)(Math.random()*45)+1;
				j++;
			}
		}
		for(int i = 0; i < ranNums.length; i++) {
		System.out.print(ranNums[i] + " ");
		}
		
		// 오름차순 정렬
		// System.out.print(ranNum + " ");
	}
	public void practice12() {
		// 12번
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
//
//		ex.
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.next();
		int size = input.length();
		char words[] = new char[size];
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < size; i++) {
			words[i] = input.charAt(i);
			if (i == size - 1) {
				System.out.println(words[i]);
			}
			else {
				System.out.print(words[i] + ", ");
			}
			
			count++;
		}
		
		// 문자 개수에서 중복된 문자를 제외하는 법을 모르겠음
	}
}
