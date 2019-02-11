package com.iiht.java.core.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	
	//throw,throws,try,catch,finally
	/* 
	 * 
	 * Exception -- 
	 * 1. run time, unchecked exception- IGNORE (Null Pointer Exceptions)
	 * 2. compile time exception, checked exception- CANT BE IGNORED  (IOExceptions)
	
	*
	*/
	
	void taskWithcheckedException() throws FileNotFoundException {
		
		System.out.println("Hey i am in unchecked exception");
		
		File file = null;
		FileInputStream fileInputStream = null;
		
		file = new File("");
		fileInputStream = new FileInputStream(file);
	}
	
void taskWithUncheckedException()  throws NullPointerException{
		
		System.out.println("Hey i am in unchecked exception");
		
	//	int i = 1/0;
		String data = null;
		System.out.println(data.length());
	}
	
	
	public static void main(String[] args) //throws FileNotFoundException 
	{
		ExceptionTest exceptionTest = new ExceptionTest();
		/*exceptionTest.taskWithUncheckedException();
		try {System.out.println("i am first line");
		// resources 
			exceptionTest.taskWithcheckedException();
			System.out.println("i am second line");
			// close
		} 
		catch (  NullPointerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// close resources
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// close resources
		}
		
		finally {
			
			System.out.println("finally");
			// resource 
		}
		*/
		
		try {
			exceptionTest.myAgeChecker(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			System.out.println("finally");
		}
	}

	
	
	public void myAgeChecker(int age) throws Exception {
		
		if(age>20)
			throw new Exception("age is more than 20");
	}
}
