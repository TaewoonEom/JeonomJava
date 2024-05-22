package org.Jeonom.day04.array.practice;

public class Practice_Array4 {

	public static void main(String[] args) {
		// 4번
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 
		//초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		// ex.
		// 귤
		String fruits[] = {"사과", "귤", "포도", "복숭아", "참외"};
//		input[0] = "사과";
//		input[1] = "귤";
//		input[2] = "포도";
//		input[3] = "복숭아";
//		input[4] = "참외";
//		System.out.print(fruits[1]);
		
		for(int i = 0; i <fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
		
	}

}
