package com.Van;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Amazon {

		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        JavascriptExecutor js =(JavascriptExecutor) driver;
	        WebElement insta =driver.findElement(By.xpath("//a[@href='http://www.amazon.in/gp/redirect.html?location=https://www.instagram.com/amazondotin&token=264882C912E9D005CB1D9B61F12E125D5DF9BFC7&source=standards']"));
	        js.executeScript("arguments[0].scrollIntoView();", insta);

	}

}
