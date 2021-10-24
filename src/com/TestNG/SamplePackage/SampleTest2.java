package com.TestNG.SamplePackage;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
// Below Listner used to run only the priority 1 tests using the IMethodInterceptor Listener
@Listeners(com.TestNG.SamplePackage.MyTestMethodInterceptor.class)
public class SampleTest2 {
	
	@Test(priority = 1)
	public void sampleCheck4() {
		System.out.println("Sample Check4 executed successfully");
	}
	
	@Test(priority=2)
	public void sampleCheck5() {
		System.out.println("Sample Check5 executed successfully");
	}
	
	@Test(priority =1)
	public void sampleCheck6() {
		System.out.println("Sample Check6 executed successfully");
//		Assert.assertEquals(true, false);
		
		Assert.assertEquals(true, true);
	}

}


