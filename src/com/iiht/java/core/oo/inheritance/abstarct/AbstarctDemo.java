package com.iiht.java.core.oo.inheritance.abstarct;

public class AbstarctDemo {
public static void main(String[] args) {
	//TestInterfaceWithjavaEight.doTask2();
	
	TestJavaEightInterfaces testJavaEightInterfaces = new TestJavaEightInterfaces();
	testJavaEightInterfaces.doTask();
}
}


 interface TestI{
	 // 100 abstaraction
	 // by default public and abstarct
	void doTask();
	default void doSomething() {}
}
 
 class TestIImplemnetation implements TestI{

	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		
	}}
 
 
 abstract class AbstractClass{
	 /// 0 to 100 % abstarction
	 // you can not create the object class
 void dotask() {
		 
		 System.out.println("hello");
	 }
	 
	 abstract void doTaskAbstarct();
	 
 }
 
 
 class TestAbstractClass extends AbstractClass {

	@Override
	void doTaskAbstarct() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 }
 
 
 interface TestInterfaceWithjavaEight1{
	 
	 default void doTask() {
		 System.out.println("hello  i am java 8 interface-1");
	 }
	 // meant for utility
	 static void doTask2() {
		 System.out.println("i am java 8 interface-static method");
	 }
	 
	 void doTask3();
 }
interface TestInterfaceWithjavaEight2{
	 
	 default void doTask() {
		 System.out.println("hello  i am java 8 interface 2");
	 }
	 // meant for utility
	 static void doTask2() {
		 System.out.println("i am java 8 interface-static method");
	 }
	 
	 void doTask3();
 }

class TestJavaEightInterfaces implements TestInterfaceWithjavaEight1,TestInterfaceWithjavaEight2{

	@Override
	public void doTask3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("i wasd forced to implement it here bcz two interfaces having same def methods  ");
	}
	
	
}