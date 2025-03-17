package com.patternPrgromming;

public class P16_03_2025_4_NumberPattern {
	public static void main(String[] args) {
		
		int num=1;
		for(int i=0;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
