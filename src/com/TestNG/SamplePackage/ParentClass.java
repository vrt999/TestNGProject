package com.TestNG.SamplePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class ParentClass {
	@Parameters({"p1"})
	@BeforeMethod
	public void parentBeforeSuiteMethod(String name) {
		System.out.println("I am parent before method " + name);
	}
	
	@AfterMethod
	public void parentAfterSuiteMethod() {
		System.out.println("I am parent After method");
	}
	//TestNG doesn't support method overloading
	

}
/*@Test
class SubClass extends ParentClass {
	
	public void childMethod() {
		System.out.println("I am child method");
	}}*/

/* with @test method to the sub class and parent
I am parent method
I am child method
I am parent method*/

/* without @test method to the sub class and @Test for parent
I am parent method
I am parent method*/

/* with @Test only to the subclass 
 * I am child method
*/
