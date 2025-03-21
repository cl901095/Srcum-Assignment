package com.stringprograms;

public class FirstNonREpatedCharcter18_03_2025 {
	public static void main(String[] args) {

		String s = "chandra";

		for (int i = 0; i < s.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j & s.charAt(i) == s.charAt(j)) {
					unique = false;
				}
			}
			if (unique) {
				System.out.println("first non repeated charcter = " + s.charAt(i));
				break;
			}
		}
	}

}
