package com.testcore;

import java.util.Scanner;

class Product {
	
	public void consume () throws InterruptedException {
		synchronized(this) {
			
			System.out.println("Press Enter to consume");
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			System.out.println("Cosumed");
			notify();
			
		}
	}
	public void produce() throws InterruptedException {
		synchronized(this) {
			wait();
			System.out.println("Production started");
			
			
		}
		
	}
}

public class ThreadComm {
	
	public static void main(String[] args) throws InterruptedException {
		Product product = new Product();
		
		Thread producer = new Thread(()->{
			try {
				product.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread consumer = new Thread(()->{
			try {
				product.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		producer.start();
		consumer.start();

	}

}
