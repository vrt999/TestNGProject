package com.TestNG.SamplePackage;

import org.testng.annotations.Test;

@Test
class MainClass{
	public void method1() {
		System.out.println("I am method1");
	}
}

public class NoTestSubClass extends MainClass {
	public void method2() {
		System.out.println("I am method2");
	}
	public void method3() {
		System.out.println("I am method3");
	}
	public void method4() {
		System.out.println("I am method4");
	}

}

/* output
I am method1 //parent goes twice as child extends it
I am method2 //TestNG runs the test methods based on ASCII values ascending
I am method3
I am method4
I am method1
default priority order

‘$’ has highest priority.
Capital alphabets will be second priority.
Underscore will have third priority.
Small letter alphabets will be fourth priority.

*/
