package com.testcore;

public class VowelCheck {
	public static void main(String[] args) {
		String word = "Welcome";
//		if(word.contains("a"))
//			System.out.println("Present");
//		if(word.contains("e"))
//			System.out.println("Present");
//		if(word.contains("i"))
//			System.out.println("Present");
//		if(word.contains("0"))
//			System.out.println("Present");
//		if(word.contains("u"))
//			System.out.println("Present");
		if(word.matches(".*[aeiou].*")==true)
			System.out.println("Present");
	}
	
}
