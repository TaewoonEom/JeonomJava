package org.Jeonom.day04.array.practice;

public class Practice_Array2 {

	public static void main(String[] args) {
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

}
