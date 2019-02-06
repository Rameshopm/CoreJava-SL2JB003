package com.iiht.java.core.oo;

public class ObjectClassTest {
	
	public static void main(String[] args) {
		
		CSEStudent cSEStudent = new CSEStudent();
		cSEStudent.roll=123;
		cSEStudent.name="Tom";
		cSEStudent.address="Test Street 123";
		System.out.println(cSEStudent.roll);
		System.out.println(cSEStudent.name);
		System.out.println(cSEStudent.address);
		
		cSEStudent.studentSleep();
		
		
		
		CSEStudent cSEStudent1 = new CSEStudent();
		cSEStudent1.roll=124;
		cSEStudent1.name="Ram";
		cSEStudent1.address="Test Street 124";
		System.out.println(cSEStudent1.roll);
		System.out.println(cSEStudent1.name);
		System.out.println(cSEStudent1.address);
		
		cSEStudent1.studentSleep();
		
	}

}



class CSEStudent{
//instance variables // object properties
	int roll;
	String name;
	String address;
	
	
	// behaviours/methods/actions
	
	
	void studentEat() {
		
		System.out.println("Hey i am "+this.name+" i am eatin g in my way");
		
	}
	
	void studentSleep() {
		System.out.println("Hey i am "+this.name+" i am sleeping g in my way");
		
	}
	
	void studentStudy() {
		System.out.println("Hey i am "+this.name+" i am studying in my way");
		
		
	}
	
}