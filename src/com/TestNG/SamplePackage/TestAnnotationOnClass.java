package com.TestNG.SamplePackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class TestAnnotationOnClass {
	@BeforeSuite
	public void method8() {
		System.out.println("I am Before Suite");
	}
	@AfterSuite
	public void method9() {
		System.out.println("I am After Suite");
	}
	@BeforeClass
	public void method1() {
		System.out.println("I am before class method");
	}
	@BeforeMethod
	public void method2() {
		System.out.println("I am before method");
		}
	@BeforeTest
	public void method6() {
		System.out.println("I am Before test");
	}
	@AfterTest
	public void method7() {
		System.out.println("I am After test");
	}
	@Test(groups = {"G1"})
	public void method3() {
		System.out.println("I am method 3");
	}
	@Test(groups = {"G2"})
	public void method10() {
		System.out.println("I am method 10");
	}
	@AfterMethod
	public void method4() {
		System.out.println("I am after method");
	}
	@AfterClass
	public void method5() {
		System.out.println("I am after class method");
	}

}

/* output with @Test for the whole class
I am Before Suite
I am Before test
I am before method
I am before class method
I am after method
I am before method
I am method 3
I am after method
I am before method
I am after class method
I am after method
I am After test
I am After Suite
*/

/*
I am Before Suite
I am Before test
I am before method
I am method 10
I am after method
I am before method
I am method 3
I am after method
I am After test
I am After Suite

 */

/*
I am Before Suite
I am Before test
I am before method
I am method 3
I am after method
I am After test
I am After Suite
*/
