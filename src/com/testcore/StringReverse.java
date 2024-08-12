package com.testcore;

public class StringReverse {

	public static void main(String[] args) {
		String word = "Hello World!";
		char[] sequence = word.toCharArray();
		char[] result = new char[sequence.length];
		int j=0;
		for(int i=sequence.length-1;i>=0;i--) {
			if(j!=i) {
				result[j] = sequence[i];
				j++;
			}
		}
		System.out.println(result);

	}

}
