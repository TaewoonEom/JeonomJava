package org.Jeonom.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int nums[] = new int[5];
		
		for(int i = 1; i < 6; i++)  {
			System.out.print(i + "번째 정수 입력 : ");
			nums[i-1] = sc.nextInt();
		}
		
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j <(nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		System.out.print("정렬된 결과 : ");
		for(int num : nums) {
		System.out.print(num + " ");
		}
		System.out.println();
		
		int sum = nums[0] + nums[4];
		System.out.print("정렬 후 첫번째 수와 마지막 수의 합 : " + sum);
		// 문자열과 정수, 실수를 함께 출력하면 문자열이 출력된다.
			
	}	
}
