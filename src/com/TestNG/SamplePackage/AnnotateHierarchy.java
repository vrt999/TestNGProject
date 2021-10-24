package com.TestNG.SamplePackage;

 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
//@Test(groups = {"G1"})
public class AnnotateHierarchy
{
	@Test(groups = {"G1"})
    public void testCase2() {
    	System.out.println("Test Method2");
    }
	@Test(groups = {"G2"})
    public void testCase3() {
    	System.out.println("Test Method3");
    }
    // if any of the before tags fail then the furter annotated methods will fail 
    @BeforeSuite
    public void beforeSuite2() {
        System.out.println("Before Suite method2");
    }
 
    @AfterSuite
    public void afterSuite2() {
        System.out.println("After Suite method2");
    }
 
    @BeforeTest
    public void beforeTest2() {
        System.out.println("Before Test method2");}

     
    @AfterTest
    public void afterTest2() {
        System.out.println("After Test method2");
    }
     
    @BeforeClass
    public void beforeClass2() {
        System.out.println("Before Class method2");
    }
 
    @AfterClass
    public void afterClass2() {
        System.out.println("After Class method2");
    }
 
    @BeforeMethod
    public void beforeMethod2() {
        System.out.println("Before Method2");
    }
 
    @AfterMethod
    public void afterMethod2() {
        System.out.println("After Method2");
    }
}

/*
Before Suite method
Before Test method
Before Class method
Before Method
Test Method
After Method
After Class method
After Test method
After Suite method
*/

/* when ran the test with @test tag for class the output is as below
Before Suite method2
Before Test method2
Before Class method2
Before Method2
Test Method2
After Method2
After Class method2
After Test method2
After Suite method2
*/

// Groups will be applicable to all the levels of before and after annotations
