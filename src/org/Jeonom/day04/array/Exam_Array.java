package org.Jeonom.day04.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num; // 변수의 선언 [Stack 메모리에 저장(정적)]
		num = 1; // 변수의 초기화
		
		int nums[]; // 배열의 선언 [Stack 메모리에 저장(정적)]
		nums = new int[10]; // 배열의 생성(할당) [Heap 메모리에 저장(동적)]
		nums[0] = 1; // 배열의 초기화 [참조변수: 주소값을 저장한다]
		
		System.out.println(nums[0]);
		System.out.println(nums[1]); // 값을 저장하지 않으면 0 출력
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		System.out.println(nums.length); // 배열의 길이 출력

		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}

}
