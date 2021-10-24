package com.TestNG.SamplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetEnteredtext {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.cssSelector("input[name = 'firstname']"));
		e.sendKeys("Ravi");
		System.out.println("The entered text is " + e.getAttribute("value"));
		//getAttribute("value) gives the text entered
		//getAttribute("maxlentgh") gives the max limit of the text box
		WebElement e1 = driver.findElement(By.cssSelector("input[name = 'lastname']"));
		e1.sendKeys("Vadlamudi");
		System.out.println("The entered text is " + e1.getAttribute("value"));
		WebElement e2 = driver.findElement(By.cssSelector("input[name = 'reg_email__']"));
		e2.sendKeys("90427777427");
		System.out.println("The entered text is " + e2.getAttribute("value"));
		WebElement e3 = driver.findElement(By.cssSelector("input[name = 'reg_passwd__']"));
		e3.sendKeys("Password");
		System.out.println("The entered text is " + e3.getAttribute("value"));
		WebElement e4 = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select s = new Select(e4);
		s.selectByVisibleText("2");
		System.out.println("The enetered text is " + e4.getAttribute("value"));
		System.out.println("The page title is: " + driver.getTitle());
	}

}
