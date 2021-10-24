package com.TestNG.SamplePackage;

import org.testng.annotations.Test;

public class PriorityAttribute {

	// TestNG methods execute based on priority lowest to highest 
	// if TestNG methods of two classes have same priority they will be run combinely based on the priority order 
	@Test(priority=-1)
	public void M1withPriority()
	{
		System.out.println("M1withPriority");
	}
	
	// TestNG will assign priority as zero to this method
	@Test
	public void PrintWithoutPriority()
	{
		System.out.println("PrintWithoutPriority");
	}
	
	// TestNG will assign priority as zero to this method
	/*
	 * There is tie between PrintWithoutPriority and DispWithoutPriority.
	 * So TestNg will use here ASCII rule to decide which method to be run first. 
	 * Since ASCII of 'D' is 68 and ASCII of 'P' is 80. So method  DispWithoutPriority
	 * will be executed first as it has lowest ASCII. 
	 */
	@Test
	public void DispWithoutPriority()
	{
		System.out.println("DispWithoutPriority");
	}
	
	@Test(priority=1)
	public void M4withPriority()
	{
		System.out.println("M4withPriority");
	}
	
	
}

/* output
M1withPriority
DispWithoutPriority
PrintWithoutPriority
M4withPriority
 */


