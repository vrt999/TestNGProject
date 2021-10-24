package com.TestNG.SamplePackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//SoftAssert declaration should be given only within test method level
// If given at class level the failure status is shown only for the last test failed

public class TestOne {
		
	@Test
	public void testCaseOne() {
		System.out.println("*** test case one started ***");
		Assert.assertEquals(5, 5, "First hard assert failed");
		System.out.println("testCaseOne hard assert success....");
		Assert.assertTrue("Hello".equals("hello"), "testCaseOne Second hard assert failed");
		Assert.assertTrue("Welcome".equals("welcomeeee"), "testCaseone Third soft assert failed");
		System.out.println("*** test case one executed successfully ***");
	}

	@Test
	public void testCasetwo() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("testCaseTwo soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "testCasetwo Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "testCasetwo Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
	}
	
/*	@Test
	public void testCaseThree() {
		System.out.println("*** test case Three started ***");
		softAssert.assertEquals(5, 5, "First hard assert failed");
		System.out.println("testCaseThree hard assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "testCaseThree Second hard assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "testCaseThree Third soft assert failed");
		System.out.println("*** test case Three executed successfully ***");
	}
*/

}
