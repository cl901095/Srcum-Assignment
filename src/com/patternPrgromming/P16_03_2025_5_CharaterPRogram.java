package com.patternPrgromming;

public class P16_03_2025_5_CharaterPRogram {

	public static void main(String[] args) {
	
		char ch;
		for(int i=0;i<=5;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
