package com.arrayPrograms;

public class DuplicateElements_17_03_2025 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6 };
		int dup = 0;
		System.out.println("duplicate elemnets are = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup = arr[j];
					System.out.println(dup);

				}
			}

		}

	}

}
