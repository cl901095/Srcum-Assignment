package com.patternPrgromming;

import java.util.Scanner;

public class P16_03_2025_1_StarProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number = ");
		int size=sc.nextInt();
		
		
		//for each row
		for(int i=0;i<size;i++) {
			
			//fro column
			for(int j=0;j<size;j++) {
				
				if(j==i||j==(size-i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
