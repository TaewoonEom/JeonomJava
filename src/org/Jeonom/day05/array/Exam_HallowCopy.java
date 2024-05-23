package org.Jeonom.day05.array;

public class Exam_HallowCopy {
	public static void main(String [] args) {
		// 배열의 복사 중 얕은 복사
		int arrs[] = new int[4];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i*i;
		}
		// for-each문 (배열이나 나열에만 사용할 수 있다.)
		// 원래
		// for(int i = 0; i < arrs.lengths; i++) {
		int copy[] = arrs; // 배열 얕은 복사
		copy[1] = 11;	   // 두번째 값 변경
		// copy 배열의 2번째 값만 바꾼게 아니라 같은 공간에 있는 두번째 값을 모두 변경한 것
		// 따라서 arrs 배열과 copy 배열 중 어느 한 배열에 들어있는 값을 변경하면
		// 두 배열의 값이 같이 변경된다.
		for (int i : arrs) {
			System.out.print(i + " "); // 0 1 4 9
		}
		System.out.println();
		for(int i : copy) {
			System.out.print(i + " "); // 0 11 4 9
		}
	}
}
