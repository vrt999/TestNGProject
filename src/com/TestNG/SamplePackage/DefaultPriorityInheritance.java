package com.TestNG.SamplePackage;

import org.testng.annotations.Test;
@Test
class ParentsClass {
	public void Method1() {
		System.out.println("I am capital method from parent");
	}
	
	public void $Method() {
		System.out.println("I am dollar method from parent");
	}
	
	
}
//@Test
public class DefaultPriorityInheritance extends ParentsClass{
	
	public void $child() {
		System.out.println("I am Child dollar method");
	}
	public void _child() {
		System.out.println("I am child underscore method");
	}
	public void Child() {
		System.out.println("I am child capital method");
	}
	public void child() {
		System.out.println("I am child small method");
	}
	public void child3() {
		System.out.println("I am child small method3");
	}
	public void child1() {
		System.out.println("I am child small method1");
	}
	public void child2() {
		System.out.println("I am child small method2");
	}
}


/* output
I am Child dollar method
I am child capital method
I am child underscore method
I am child small method
I am child small method1
I am child small method2
I am child small method3
I am dollar method from parent
I am capital method from parent
I am dollar method from parent
I am capital method from parent
*/
