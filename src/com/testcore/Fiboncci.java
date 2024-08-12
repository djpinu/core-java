package com.testcore;

public class Fiboncci {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21
		printFibonacci(10);
		
	}
	static void printFibonacci(int count) {
		int a=0;
		int b=1;
		int c=1;
		
		for (int i=1;i<=count;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
