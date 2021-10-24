package com.TestNG.SamplePackage;

import org.testng.annotations.Test;

public class Dependencies {
	@Test
	public void test1() {
		int i = 1/0;
		System.out.println("I am test1" + i);
	}
	//Below is Soft dependency which doesn't skip the test2 if the test1 is failed
	//If the alwaysRun isnot mentioned by default it will take the alwaysRun = flase and skips the test2
	@Test(dependsOnMethods = {"test1"})//hard dependency
	public void test2() {
		System.out.println("I am test2");
		
	}
	@Test(dependsOnMethods = {"test1"},alwaysRun = true)//soft dependency
	public void test8() {
		System.out.println("I am test8");		
	}
	
	@Test(dependsOnMethods = {"test1"},enabled = false)//this test willnot run as enabled is false
	public void test9() {
		System.out.println("I am test9");
		
	}
	
	@Test(groups = {"groupA"},dependsOnMethods = {"test1"},ignoreMissingDependencies=true)//this runs even if the test1 isnot present in the class
	public void test3() {
		System.out.println("I am test3");
		
	}
	@Test(groups = {"groupA"})
	public void test4() {
		System.out.println("I am test4");
		
	}
	@Test(groups = {"groupB"},priority = 2)//setting up the priority value for the order
	public void test5() {
		System.out.println("I am test5");
		
	}
	@Test(groups = {"groupB"},priority = 1)
	public void test6() {
		System.out.println("I am test6");
		
	}
	@Test(dependsOnGroups = {"groupA","groupB"}) //hard dependency
	public void test7() {
		System.out.println("I am test7");
		
	}

}
