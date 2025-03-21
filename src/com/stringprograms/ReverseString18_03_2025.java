package com.stringprograms;

public class ReverseString18_03_2025 {
	
	public static void main(String[] args) {
		String s="chandrasekhar";
		//approach1
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//aproach2
		StringBuffer bf=new StringBuffer(s);
		System.out.println(bf.reverse());
		
	}

}
