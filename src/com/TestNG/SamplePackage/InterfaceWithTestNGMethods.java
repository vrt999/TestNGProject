package com.TestNG.SamplePackage;

import org.testng.annotations.Test;

public interface InterfaceWithTestNGMethods {

	
	@Test
	public static void staticMethod() {
		System.out.println("I am static method");		
	}
	
	@Test
	public default void defaultMethod() {
		System.out.println("I am default method");		
	}

}
