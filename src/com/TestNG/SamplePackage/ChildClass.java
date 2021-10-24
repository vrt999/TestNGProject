package com.TestNG.SamplePackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
@Test
//(invocationCount = 10)
public class ChildClass extends ParentClass {
	
//	@Parameters({"p1"})
//	@Test
	public void childMethod1() {
		System.out.println("I am child method1");
	}

	public void childMethod2() {
		System.out.println("I am child method2");
//		childMethod1();
	}
	
/*	public static void main(String[] args) {
		System.out.println("This is main method");
	}*/
/*	@Test(expectedExceptions = ArithmeticException.class,threadPoolSize = 3,invocationCount = 10)
	//threadpoolsize is ignored if invocationcount isnot specified
	 public void testException() {
	 System.out.println("SoftwareTestingMaterial.com");
	 int i = 1 / 0; 
	 }*/
	


}

//TestNG doesn't support method overloading and can be achieved only through data providers
//TestNG supports method overridding and it processes only the overidden methods of the class


/* output
I am child method1
I am child method2
I am parent method
*/
/* out put
I am child method1
I am child method2
I am child method1 */