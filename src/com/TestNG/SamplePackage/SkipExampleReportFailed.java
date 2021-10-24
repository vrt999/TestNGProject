package com.TestNG.SamplePackage;

import org.testng.SkipException;
import org.testng.annotations.Test;
 
// Extending SkipException class
public class SkipExampleReportFailed extends SkipException{
 
// Constructor call
public SkipExampleReportFailed(String skipMessage) {
super(skipMessage);
// TODO Auto-generated constructor stub
}
 
// Overriding default behavior to mark a test as failed instead of skipped
@Override
public boolean isSkip() {
	System.out.println(" I am isSkip method");
return false;
}
/*
* SUppose this flag will be passed from some data source. For example, I assign
* some value here. I am taking it as String just to ignore default value of
* global variable
*/
String flag = "false";
 
@Test
public void Test1() {
if (flag.equals("true")) {
System.out.println("Test 1 will be executed and Test 2 will be skipped.");
} else {
throw new SkipExampleReportFailed("Skipping Test 1 as flag is false.");
}
 
}
 
@Test
public void Test2() {
if (flag.equals("false")) {
System.out.println("Test 2 will be executed and Test 1 will be skipped.");
} else {
throw new SkipExampleReportFailed("Skipping Test 2 as flag is true.");
}
 
}
 
}
