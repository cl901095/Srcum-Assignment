package com.stringprograms;

public class DuplicatecharcterString18_03_2025 {
	public static void main(String[] args) {
		String s = "chnadra";

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate charcter in given string = " + ch[j]);
				}
			}
		}
	}

}
