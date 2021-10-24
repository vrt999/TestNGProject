package com.TestNG.SamplePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Test(retryAnalyzer=com.TestNG.SamplePackage.MyTestRetryAnalyzer.class)
// Retry analyzer can be done at class,test and suite level
// for suite level we need to use listeners
public class TestRetryAnalyzer {
	
	@Test
	public void sampleCheck1() {
		System.out.println("Sample Check1 executed successfully");
	}
	
	@Test
	public void sampleCheck2() {
		System.out.println("Sample Check2 executed successfully");
		Assert.assertEquals(true, false);
	}
	
	
	@Test
	public void sampleCheck3() {
		System.out.println("Sample Check3 executed successfully");
		Assert.assertEquals(true, false);
//		Assert.assertEquals(true, true);
	}

}
