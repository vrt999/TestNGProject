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

public class Test2 {
	
	@BeforeSuite(groups = {"G1"})
	public void method8() {
		System.out.println("I am test2 Before Suite");
	}
	@AfterSuite(groups = {"G1"})
	public void method9() {
		System.out.println("I am test2 After Suite");
	}
	@BeforeClass(groups = {"G1"})
	public void method1() {
		System.out.println("I am test2 before class method");
	}
	@BeforeMethod(groups = {"G1"})
	public void method2() {
		System.out.println("I am test2 before method");
		}
	@BeforeTest(groups = {"G1"})
	public void method6() {
		System.out.println("I am test2 Before test");
	}
	@AfterTest(groups = {"G1"})
	public void method7() {
		System.out.println("I am test2 After test");
	}
	@Test(groups = {"G1"})
	public void method3() {
		System.out.println("I am test2 method 3");
	}
	@Test(groups = {"G2"})
	public void method10() {
		System.out.println("I am test2 method 10");
	}
	@AfterMethod(groups = {"G1"})
	public void method4() {
		System.out.println("I am test2 after method");
	}
	@AfterClass(groups = {"G1"})
	public void method5() {
		System.out.println("I am test2 after class method");
	}


}
