package com.iiht.java.core.classloading;

/*
1. bootstrap class loader- rt.jar
2.ext class loader- ext directory
3.application class loder class loader- app classes

com.iiht.java.core.classloading.TestClassLoading

bootstartp class loader
      ^
      |
Ext Class loader
       ^
       |
       
Application class loader
  */
 
 
public class ClassLoaderTest {
	
	public static void main(String[] args) {
		TestClassLoading testClassLoading = new TestClassLoading();
		testClassLoading.doTask();
	}

}
