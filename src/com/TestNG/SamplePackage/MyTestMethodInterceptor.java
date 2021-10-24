package com.TestNG.SamplePackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class MyTestMethodInterceptor implements IMethodInterceptor {

//	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext arg1) {
		
		List<IMethodInstance> methodOrder = new ArrayList<IMethodInstance>();
		for(IMethodInstance method : methods) {
			Test testmethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			if(testmethod.priority() == 1)
			{
				methodOrder.add(method);
			}
		}
		
		return methodOrder;
	}
}
