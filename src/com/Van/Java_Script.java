package com.Van;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        WebElement button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        button.click();
        WebElement face= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/flipkart']"));
        js.executeAsyncScript("arguments[0].scrollIntoView();",face);
        
	}


}
