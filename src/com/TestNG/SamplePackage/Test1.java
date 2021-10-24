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

public class Test1 {
	
	@BeforeSuite
	public void method8() {
		System.out.println("I am test1 Before Suite");
	}
	@AfterSuite
	public void method9() {
		System.out.println("I am test1 After Suite");
	}
	@BeforeClass
	public void method1() {
		System.out.println("I am test1 before class method");
	}
	@BeforeMethod
	public void method2() {
		System.out.println("I am test1 before method");
		}
	@BeforeTest
	public void method6() {
		System.out.println("I am test1 Before test");
	}
	@AfterTest
	public void method7() {
		System.out.println("I am test1 After test");
	}
	@Test(groups = {"G1"})
	public void method3() {
		System.out.println("I am test1 method 3");
	}
	@Test(groups = {"G2"})
	public void method10() {
		System.out.println("I am test1 method 10");
	}
	@AfterMethod
	public void method4() {
		System.out.println("I am test1 after method");
	}
	@AfterClass
	public void method5() {
		System.out.println("I am test1 after class method");
	}


}
