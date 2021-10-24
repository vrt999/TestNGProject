package com.TestNG.SamplePackage;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class Testcase1  
{  
@Test  
public void test1()  
{  
System.out.println("testcase 1");  
}  
} 

class Testcase2   
{  
@Test  
public void test1()  
{  
System.out.println("testcase 2");  
}  
} 

public class FactoryClass {
	
	@Factory  
	public Object[] getTestClasses()  
	{  
	Object tests[]=new Object[2];  
	tests[0]=new Testcase1();  
	tests[1]=new Testcase2();  
	return tests;  
	}

}
