package com.arrayPrograms;

import java.util.Arrays;

public class ReverseAnArray_WhileLoop_17_03_2025 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int i = 0;
		int j = arr.length - 1;
		int temp = 0;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
		System.out.println(Arrays.toString(arr));
	}

}
