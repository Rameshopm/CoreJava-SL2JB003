package com.iiht.java.core.oo.aceessmodifiers.one;

public class PrivateMemberClass {

	private int mySampleProperty = 10;

	private void doNothing() {
		System.out.println("Hey i am from porivate method");
	}
	
	void doNothing2() {
		// i am able to access priovate members here bcz i am in same class
		System.out.println(mySampleProperty);
		doNothing();
	}

}

class PrivateMemberClassTest {

	public void testPrivateMembers() {
		
		PrivateMemberClass privateMemberClass = new PrivateMemberClass();
		/*
		 * The field PrivateMemberClass.mySampleProperty is not visible
System.out.println(privateMemberClass.mySampleProperty);
The method doNothing() from the type PrivateMemberClass is not visible
privateMemberClass.doNothing();*/
		
		
		privateMemberClass.doNothing2();
	}
}
