package com.testcore;

public class Palindrome {
	public static void main(String[] args) {
		boolean result;
		result=isPalindrome("abcdcba");
		System.out.println(result);

	}
	static boolean isPalindrome(String word) {
		boolean result=true;
		int length=word.length();
		for(int i=0;i<length/2;i++) {
			if(word.charAt(i)!=word.charAt(length-i-1)) {
				result=false;
				break;	
			}	
		}
		return result;
	}

}
