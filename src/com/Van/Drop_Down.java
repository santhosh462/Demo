package com.Van;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();
		
        WebElement single=driver.findElement(By.name("dropdown2"));
        Select s =new Select(single);
        s.selectByValue("2");
        
        WebElement multi = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select s1 = new Select(multi);
        s1.selectByVisibleText("Loadrunner");
        s1.selectByVisibleText("Selenium");
        
        WebElement single1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
        Select s2=new Select(single1);
        s2.selectByVisibleText("Appium");
        
        
	}

} 