package com.Van;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Works {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();

		   Actions a= new Actions(driver);
		   WebElement best= driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		   a.contextClick(best).build().perform();
           Robot r= new Robot();
           r.keyPress(KeyEvent.VK_DOWN);
           r.keyRelease(KeyEvent.VK_DOWN);
           r.keyPress(KeyEvent.VK_ENTER);
           r.keyRelease(KeyEvent.VK_ENTER);
		   
           
           
           
	}

}
