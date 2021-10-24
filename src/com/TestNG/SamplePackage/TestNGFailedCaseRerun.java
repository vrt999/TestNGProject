package com.TestNG.SamplePackage;

import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNGFailedCaseRerun {
	
	@Test
	public void failedCasesRerun() {
		
		TestNG runner = new TestNG();		
		ArrayList<String> arr = new ArrayList<String>();		
		arr.add("F:\\myproject\\TestNGProject\\test-output\\testng-failed.xml");		
		runner.setTestSuites(arr);		
		runner.run();
		
	}

}
