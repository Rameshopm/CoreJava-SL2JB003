package com.iiht.java.core.oo.inheritance.overloading;

public class OverloadingTest {
	
	public static void main(String[] args) throws Exception {
		OverloadingClass overloadingClass  = new OverloadingClass();//(#0*xf00123)
		overloadingClass.doTest();
		overloadingClass.doTest("test");
	 
	}

}

class OverloadingClass{
	
public void doTest() {
		
		System.out.println("Hey i am  doing task");
	}
	
public void doTest(String taskName) throws Exception{
		
		System.out.println("Hey i am  doing task-2");
	}
	
	
/*
 * Method overloading cant be done by  changing retutn type of the method.
 * 
 * public int doTest(String taskName) {
	
	System.out.println("Hey i am  doing task");
	return 1;
}*/

	
}
