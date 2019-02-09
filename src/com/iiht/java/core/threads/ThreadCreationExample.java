package com.iiht.java.core.threads;

public class ThreadCreationExample {
	
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		threadTest.run();
		threadTest.start();
		System.out.println("hello i am from"+Thread.currentThread().getName());
		
	
		TestThreadWithInterface testThreadWithInterface = new TestThreadWithInterface();
		testThreadWithInterface.run();
	Thread  thread = new Thread(testThreadWithInterface);
	thread.start();
		System.out.println("hello i am from"+Thread.currentThread().getName());
	}

}


class ThreadTest extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 2; i++) {
		System.out.println("hello i am thread"+Thread.currentThread().getName());
	}
	}
}


class TestThreadWithInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			System.out.println("hello i am thread"+Thread.currentThread().getName());
		}
	}
	
}