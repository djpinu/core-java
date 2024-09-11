package com.testcore;

import java.util.Arrays;
import java.util.Enumeration;

public class AnagramTest {

	public static boolean areAnagrams(String s1, String s2) {
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(areAnagrams("listen", "hello"));
	}

}