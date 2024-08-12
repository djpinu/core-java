package com.testcore;

public class Factorial {

	public static void main(String[] args) {
		String textblock = """
				Hi
				Hello
				How are you
				""";
		int number=3;
		int count=number;
		for(int i=1;i<count;i++) {
			number=number*i;
		}
		System.out.println(textblock);
		Runnable r = ( )-> {
			System.out.println(Thread.currentThread().getName()+"Run");
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
