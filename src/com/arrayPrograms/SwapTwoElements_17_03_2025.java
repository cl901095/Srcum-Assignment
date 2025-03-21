package com.arrayPrograms;

import java.util.Arrays;

public class SwapTwoElements_17_03_2025 {
	
	public static void main(String[] args) {
		int [] arr= {12,34,56,78,99,90};
		
		for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1 ]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
