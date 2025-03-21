package com.stringprograms;

import java.util.Arrays;

public class Anagram18_03_2025 {

	public static void main(String[] args) {
		String s1 = "peek";
		String s2 = "keep";

		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		if (Arrays.toString(charArray).equals(Arrays.toString(charArray2))) {
			System.out.println("it is angaram");

		} else {
			System.out.println("It is not angaram");
		}
	}

}
