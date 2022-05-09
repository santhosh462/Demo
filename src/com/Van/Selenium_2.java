package com.Van;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_2 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   WebElement signin =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	   signin.click();
	   WebElement user =driver.findElement(By.name("email"));
	   user.sendKeys("8270968030");
	   WebElement cont=driver.findElement(By.id("continue"));
	   cont.click();
	   WebElement password=driver.findElement(By.name("password"));
	   password.sendKeys("8883996101");
	   WebElement cont1= driver.findElement(By.id("signInSubmit"));
	   cont1.click();
	   
	 
	   
		

	}

}
