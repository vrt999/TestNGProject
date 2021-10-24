package com.TestNG.SamplePackage;

import org.testng.annotations.Test;

public class TestNGReturnMethod {
// @Test methods with return statement aren't considered as @Test methods by TestNG
// we can use them as normal methods as below
	@Test
	public void method1() {
		System.out.println("I am method 1");
		System.out.println(method2());
	}
	@Test
	public String method2() {
		String s = "I am from method2";
		return s;
//	System.out.println(s);
	}
	
}
