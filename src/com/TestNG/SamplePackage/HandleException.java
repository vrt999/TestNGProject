package com.TestNG.SamplePackage;
import org.testng.annotations.Test;
public class HandleException {
	
	@Test(expectedExceptions = {ArithmeticException.class,NumberFormatException.class})
	public void testException() {
		System.out.println("SoftwareTestingMaterial.com");
		int i = 1 / 0;	
		System.out.println("The test ran after the exception");// this part wont execute but the test gets passed
	}
}
