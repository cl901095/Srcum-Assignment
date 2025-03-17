package com.patternPrgromming;

public class P16_03_2025_3_NumberPattern {
	public static void main(String[] args) {
		// for row
		for(int i=1;i<=5;i++) {
			//for coloumn
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
