package com.iiht.java.core.oo.inheritance;

public class InheritanceTest {
	
	public static void main(String[] args) {
	 	// type of object - left, actual object -right 
		int a=10;
		 
		ParentClass parentClass = new ParentClass();
		parentClass.doSomething();
		parentClass.doSomething2();
	//	parentClass.doSomethin3();

		ChildClass chiledClass = new ChildClass();
		chiledClass.doSomething();
		chiledClass.doSomething2();
		chiledClass.doSomething3();


		ParentClass parentClass2 = new ChildClass();
		parentClass2.doSomething();
		parentClass2.doSomething2();
	//	parentClass2.doSomethin3();

		/*ChildClass chiledClass2 = new ParentClass();
		chiledClass2.doSomething();
		chiledClass2.doSomething2();
		chiledClass2.doSomethin3();*/
		
	}

}


class ParentClass{
	
	int day =2;
	
	public void doSomething() {
		
		System.out.println("Do Something  from parent");
	}
	public void doSomething2() {
		
		System.out.println("Do something2 from parent");
	}
	
}


class ChildClass extends ParentClass{
	
public void doSomething2() {
		
		System.out.println("Do something2 from child");
	}

public void doSomething3() {
	
	System.out.println("Do something3 from child");
}
	
}
