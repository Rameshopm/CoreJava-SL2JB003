package com.iiht.java.core.oo;

public class ClasslevelPropertyTest {
	
	public static void main(String[] args) {
		MEStudents meStudents = new MEStudents();
		System.out.println(meStudents.roll);
		meStudents.objectBehaviour();
		
		// need not to create the object for class level props/behaviours
		System.out.println(MEStudents.boardColor);
		MEStudents.classBehaviour();
		
		
	}

}



class MEStudents{
	
	int roll;
	static String boardColor="black";
	
	public void objectBehaviour() {
		
		System.out.println("hey i am object's behaviour");
	}
	
   public static void classBehaviour() {
		
		System.out.println("hey i am class's behaviour");
	}
	
	
}