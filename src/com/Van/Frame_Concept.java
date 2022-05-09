package com.Van;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		WebElement class3=driver.findElement(By.xpath("/html/body"));
		driver.switchTo().frame(class3);
		WebElement class4=driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		class4.click();
	}

}
