package com.iiht.java.core.oo.inheritance;

import java.io.IOException;

public class PolymorphismTest {

	public static void main(String[] args) {
		Child child = new Child();
		child.doTask5();
	 
	}
	
}


class Parent{
	
	public void doTask() {}
	void doTask2() {}
	void doTask3() {}
	static void doTask4() {}
	final void doTask5() {
		System.out.println("final");
	}
	private void doTask6() {
		System.out.println("private");
	}
	
/*	1. If your parent class method throws exception then child class method can throw no exception,same exeption
	or can throw subclass exception
	2. If your parent class method does not throw any exception then child class can throw only unchecked 
	exceptions.*/
	
	void doTaskWithException() throws Exception{}
	
	void doTaskWithoutExceptions() {}
	
}

class Child extends Parent{
	
	
 //1.Cannot reduce the visibility of the inherited method from Parent
/*void doTask() {
		
	}
	
	*/

	//2 We can increase the visibility.
	public void doTask() {}
	
	// 3.can not disturb the return type ovverriding method
	/*int doTask3() {
		return 3;
	}*/
	//4. This instance method cannot override the static method from Parent
	//void doTask4() {}
	// following is not inherited method, it is brand new method for child class
	static void doTask4() {}
	// 5. Cannot override the final method from Parent, but it is available or it visible to child class
	    //void doTask5() {}
	// 6. private methods are not inherited/not visxible
	void doTask6() {
		
	}
	
	
	// i can throw same exception
	//void doTaskWithException() throws Exception{}
	
	// i am free not to throw any exception even my parents class throws it.
	//void doTaskWithException() {}
	
	// i can throw child class exception(NullPointerException is child of Exception), You can throw broader(parent class) exception in child class methods
	void doTaskWithException() throws NullPointerException{}
	
	// we can not thro checked exceptions if parenat class does not throw the exceptions
	//void doTaskWithoutExceptions() throws IOException{}
	
	
	// if parent class does not throw then child can throw un checked(run time) exceptions
	void doTaskWithoutExceptions() throws NullPointerException{}
}

