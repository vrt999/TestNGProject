package com.TestNG.SamplePackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Parameters({"p1","p2","p3","p4"})
	@Test
	public void test1(String s1,String s2,String s3,String s4) {	
		System.out.println("******Test1 start*****");
		System.out.println(s1 + "---->" + s2);
		System.out.println("check " + s3 + "---->" + s4);
		
	}
	
	@Parameters({"p3","p4"})
	@Test
	public void test2(String s1,String s2) {	
		System.out.println("******Test2 start*****");
		System.out.println(s1 + "---->" + s2);		
	}
	
	@Parameters({"p4","p5"})
	@Test
	public void test3(String s1,@Optional("")String s2) {	//@Optional should have some string value in the brackets	
		System.out.println("******Test3 start*****");
		System.out.println(s1 + "---->" + s2);		
	}
	
	

}
