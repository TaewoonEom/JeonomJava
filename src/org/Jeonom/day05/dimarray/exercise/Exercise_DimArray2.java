package org.Jeonom.day05.dimarray.exercise;

public class Exercise_DimArray2 {
	public static void main(String[] args) {
		int arrs[][] = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[j][i] = k++;
			}
		}
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs.length; j++) {
//				arrs[i][j] = m;
//				m += 5;
//			}
//			m -= 24;
//		}
		for(int j = 0; j < arrs.length; j++) {
			for(int i = 0; i < arrs.length; i++) {
				System.out.print(arrs[j][i] + " " + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
