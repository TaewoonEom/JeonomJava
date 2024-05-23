package org.Jeonom.day05.array;

public class Exam_DeepCopy {
	public static void main(String[] args) {
		// 배열 복사 중 깊은 복사
		int arrs[] = {0, 1, 4, 9};
		int copy[] = new int[4];
		// 새로운 배열을 선언 및 생성해야 어느 한 배열에 들어있는
		// 값을 변경했을 때 다른 배열에 영향이 가지 않는다.
		for(int i = 0; i < arrs.length; i++) {
			copy[i] = arrs[i];
		}
		copy[1] = 11;
		for(int i : copy) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : arrs) {
			System.out.print(i + " ");
		}
	}

}
