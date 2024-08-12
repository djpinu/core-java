package com.testcore;

public class ThreadTest{
	
//	@Override
//	public void run() {
//		
//		for(int i=0;i<=10;i++) {
//			System.out.println("from "+Thread.currentThread().getName());
//		}
//	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<=10;i++) {
					System.out.println("from "+Thread.currentThread().getName());
				}
			}
		});
		thread1.start();
		Thread thread2 = new Thread(()-> {
			
				for(int i=0;i<=10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("from "+Thread.currentThread().getName());
				}
			
		});
		thread2.start();

		Thread thread3 = new Thread(()-> {
			
			for(int i=0;i<=10;i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("from "+Thread.currentThread().getName());
			}
		
		});
		thread3.start();
	}
	
	public void m1() {
		System.out.println("from "+Thread.currentThread().getName());
	}

}
