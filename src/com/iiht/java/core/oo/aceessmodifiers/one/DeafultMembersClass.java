package com.iiht.java.core.oo.aceessmodifiers.one;

public class DeafultMembersClass {
	
	int testProperty= 10;
	void doSomething() {
		
		System.out.println("do something");
	}

}


class DefaultChild extends DeafultMembersClass{
	void doNothing()
	{
		System.out.println(testProperty);
	}}
	