package com.TestNG.SamplePackage;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ShareDataAmongTestMethods {
	
	@Test
	public void generateData(ITestContext context)
	{
		String firstName = "Amod";
		// Setting an attribute with name and its value
		context.setAttribute("FirstName", firstName);
	}
	
	
	@Test
	public void useData(ITestContext context)
	{
		String lastName = "Mahajan";
		context.setAttribute("LastName", lastName);
		// Retrieving attribute value set in ITestContext
		String FN = (String) context.getAttribute("FirstName");
		String fullName = FN +" "+lastName;
		System.out.println("Full Name is : "+fullName);
		context.setAttribute("FullName", fullName);
	}
	
	@Test(timeOut = 5000)
	public void useData1(ITestContext context)
	{
		String lastName = "Mahajan";
		// Retrieving attribute value set in ITestContext
		ISuite suite = context.getSuite();
		String FN = (String) suite.getAttribute("FirstName");
		String fullName = FN +" "+lastName;
		System.out.println("Full Name is : "+fullName);
	}
	
/*	Assert.assetEquals(String actual, String expected);
	Assert.assertEquals(String actual, String expected, String message);
	Assert.assertEquals(boolean actual, boolean expected);
	Assert.assertTrue(<condition(t/f)>);
	Assert.assertFalse(<condition(t/f)>);
	Assert.assertTrue(<condition(t/f)>,message);
	Assert.assertFalse(<condition(t/f)>,message);*/

}
