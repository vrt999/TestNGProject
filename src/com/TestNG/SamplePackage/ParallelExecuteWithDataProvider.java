package com.TestNG.SamplePackage;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecuteWithDataProvider {
	//parallel data Providers by default has the count of thread as 10.this can be modified in XML file as below
	//	<suite name="Suite1" data-provider-thread-count="20" >
	
	//indices are used to skip or choose the data for which the test has to be executed
	//by default dataproviders are set to indices = all
	
	@DataProvider(name = "testData",parallel = true,indices = {1,2})
	public Object[][] testData() {
		Object[][] data = new Object[3][4];
		data[0][0] = "Ravi";
		data[0][1] = "Vadlamudi";
		data[0][2] = "9042777427";
		data[0][3] = "Password1";
		
		data[1][0] = "Colin";
		data[1][1] = "McCormick";
		data[1][2] = "9042777428";
		data[1][3] = "Password2";
		
		data[2][0] = "Sally";
		data[2][1] = "Crawford";
		data[2][2] = "9042777429";
		data[2][3] = "Password3";
		return data;		
	}
	@DataProvider(name = "testData1")
	public Object[][] testData1(Method m,ITestContext i) {
		Object[][] data = new Object[3][4];
		i.getCurrentXmlTest().getParameter("DataFileforA");
		data[0][0] = "Ravi";
		data[0][1] = "Vadlamudi";
		data[0][2] = "9042777427";
		data[0][3] = "Password1";
		
		data[1][0] = "Colin";
		data[1][1] = "McCormick";
		data[1][2] = "9042777428";
		data[1][3] = "Password2";
		
		data[2][0] = "Sally";
		data[2][1] = "Crawford";
		data[2][2] = "9042777429";
		data[2][3] = "Password3";
		
		
		return data;		
	}
	@Test(dataProvider = "testData")
	public void test1(String FirstName,String LastName,String Email,String Password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name = 'firstname']")).sendKeys(FirstName);
		driver.findElement(By.cssSelector("input[name = 'lastname']")).sendKeys(LastName);
		
		driver.findElement(By.cssSelector("input[name = 'reg_email__']")).sendKeys(Email);
		
		driver.findElement(By.cssSelector("input[name = 'reg_passwd__']")).sendKeys(Password);
	}
	

}
