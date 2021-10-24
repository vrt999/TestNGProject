package com.TestNG.SamplePackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Test @Ignore
@Test(enabled = false)
public class IgnoreAnnotation {
	//To ignore all the class method tests and its sub class tests even if the @test is present at method level,@Ignore is used
	//Enable = false at class level achieves it but if any of the methods in the class have @Test it will be overidden
	//and the test runs
	@Test
	public void method1() {
		System.out.println("I am method1");
	}
	public void method2() {
		System.out.println("I am method2");
	}

}

//output: I am method1

class Check extends IgnoreAnnotation {
	@Test
	public void method3() {
		System.out.println("I am method3");
	}
}
