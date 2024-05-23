package org.Jeonom.day05.dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String[] args) {
		int arrs[][] = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[i][j] = k++;
			}
		}
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs.length; j++) {
//				arrs[i][j] = k+4;
//				k--;
//			}
//			k += 10;
//		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs.length; j++) {
				System.out.print(arrs[i][j] + " " + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
