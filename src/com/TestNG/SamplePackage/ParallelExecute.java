package com.TestNG.SamplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecute {
	
//	@Test(parallel = true) - this is not valid and can be given only in TestNG xml or in Data providers
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)//same test runs 6 times with thread limit as 3
	public void test1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name = 'firstname']")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input[name = 'lastname']")).sendKeys("Vadlamudi");
		
		driver.findElement(By.cssSelector("input[name = 'reg_email__']")).sendKeys("90427777427");
		
		driver.findElement(By.cssSelector("input[name = 'reg_passwd__']")).sendKeys("Password");
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.jabong.com");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("input#search")).sendKeys("Shoes");
		driver.findElement(By.cssSelector("span.top-search-icon")).click();
	}
	
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
		driver.findElement(By.cssSelector("input.LM6RPg")).sendKeys("Nokia Lumia 320");
		driver.findElement(By.cssSelector("button.vh79eN")).click();
	}

}
