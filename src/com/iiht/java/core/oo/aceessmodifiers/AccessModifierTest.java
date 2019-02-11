package com.iiht.java.core.oo.aceessmodifiers;

import com.iiht.java.core.oo.aceessmodifiers.one.DeafultMembersClass;
import com.iiht.java.core.oo.aceessmodifiers.one.ProtectedmemberClass;
import com.iiht.java.core.oo.aceessmodifiers.one.PublicMemberClass;

public class AccessModifierTest {

	
	/*These are access modifiers for class members
	 * 
	 * Private - same  class
	 * Default - same package
	 * Protected -Same package and sublcasses in other package , p1-->c1(protected memebers), p2-->c2(child of c1) then 
	 * you can access memebers of c1 inside p1 and inside class 2 as well.
	 * Public -  Access anywhere
	 * 
	 * */
	
	
	public static void main(String[] args) {
		DeafultMembersClass 		deafultMembersClass = new DeafultMembersClass();
		
		// The field DeafultMembersClass.testProperty is not visible
	//	deafultMembersClass.testProperty
	//The method doSomething() from the type DeafultMembersClass is not visible
	//	deafultMembersClass.doSomething();
		
		
		ProtectedmemberClass protectedmemberClass = new ProtectedmemberClass();
	//	protectedmemberClass.testProperty;
		
		
		PublicMemberClass publicMemberClass= new PublicMemberClass();
		System.out.println(publicMemberClass.testProperty);
		publicMemberClass.doSomething();
	}
	
}


class DefaultChild extends DeafultMembersClass{
	void doNothing()
	{
	// The field DeafultMembersClass.testProperty is not visible	
	//	System.out.println(testProperty);
	}
	
}



class ProtectedChild extends ProtectedmemberClass{
	void doNothing()
	{
	// The field DeafultMembersClass.testProperty is not visible	
	System.out.println(testProperty);
	
	}
	
	class PublicChildClass extends PublicMemberClass{
		void dotask() {
			System.out.println(testProperty);
			
		}
	}
	
}