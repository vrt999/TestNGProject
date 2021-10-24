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
@Test
public class AnnotationHierarchy
{
	
    public void testCase1() {
    	System.out.println("Test Method1");
    }
	@Test(groups = {"G2"})
    public void testCase4() {
    	System.out.println("Test Method4");
    }
    // if any of the before tags fail then the furter annotated methods will fail 
    @BeforeSuite
    public void beforeSuite1() {
        System.out.println("Before Suite method1");
    }
 
    @AfterSuite
    public void afterSuite1() {
        System.out.println("After Suite method1");
    }
 
    @BeforeTest
    public void beforeTest1() {
        System.out.println("Before Test method1");}

     
    @AfterTest
    public void afterTest1() {
        System.out.println("After Test method1");
    }
     
    @BeforeClass
    public void beforeClass1() {
        System.out.println("Before Class method1");
    }
 
    @AfterClass
    public void afterClass1() {
        System.out.println("After Class method1");
    }
 
    @BeforeMethod
    public void beforeMethod1() {
        System.out.println("Before Method1");
    }
 
    @AfterMethod
    public void afterMethod1() {
        System.out.println("After Method1");
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

// Ran the TestNG xml file with two classes having different annotation methods
/*
Before Suite method2
Before Suite method1
Before Test method2
Before Test method1
Before Class method2
Before Method2
Test Method2
After Method2
After Class method2
Before Class method1
Before Method1
Test Method1
After Method1
After Class method1
After Test method2
After Test method1
After Suite method2
After Suite method1
*/
