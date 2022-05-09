package com.Van;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Single {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();
        
        WebElement single=driver.findElement(By.id("dropdown1"));
        Select s=new Select(single);
        s.selectByValue("2");
        WebElement single1=driver.findElement(By.name("dropdown2"));
        Select s1=new Select(single1);
        s1.selectByValue("3");
	}

}
