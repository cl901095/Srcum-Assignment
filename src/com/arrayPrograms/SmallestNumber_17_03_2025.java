package com.arrayPrograms;

import java.util.Arrays;

public class SmallestNumber_17_03_2025 {
	public static void main(String[] args) {
		
		//approch1
		int [] arr= {23,45,67,89,90};
		Arrays.sort(arr);
		System.out.println("smallest number in array= "+arr[0]);
		
		
		//Approach2
		int smallestNumber=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestNumber) {
				smallestNumber=arr[i];
			}
			
		}
		System.out.println(smallestNumber);
	}

}
