package com.TestNG.SamplePackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyTestRetryAnalyzer implements IRetryAnalyzer {
	
	int counter = 0;
	int retryLimit = 2;

	@Override
	public boolean retry(ITestResult arg0) {
		
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		else
		return false;
	}
	
	

}
