package com.iiht.java.core.oo;

public class ConstructorDemo {
	
	//
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("hey my roll number is:"+student.roll);
		
		Student student2 = new Student();
		System.out.println("hey my roll number is:"+student2.roll);
		
		Student student3 = new Student(11,"Tom","Test street 123");
		System.out.println("my name is:"+student3.name);
	}

}

class Student{
	
	int roll;
	String name;
	String address;
	
	
	public Student() {
		
		System.out.println("hey i am constructing your object");
		
		this.roll =10;
		 
	}


	public Student(int roll1, String name1, String address1) {
		//super();
		this.roll = roll1;
		this.name = name1;
		this.address = address1;
	}
	
	
	
	
}
