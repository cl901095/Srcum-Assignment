package com.arrayPrograms;

import java.util.Arrays;

public class Ascending_DescendingArray_17_03_2025 {
	public static void main(String[] args) {
		
		int [] arr= {12,34,56,8,1,9,0};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("aseconding order = "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("desecnding order = "+Arrays.toString(arr));
	}
	
	

}
