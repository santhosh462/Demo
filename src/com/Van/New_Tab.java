package com.Van;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_Tab {

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
            
          String set= driver.getWindowHandle();
          driver.switchTo().window(set);
          
          
          WebElement add= driver.findElement(By.xpath("//div[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
          add.click();
          WebElement proc=driver.findElement(By.xpath("//div[@class='layer_cart_cart col-xs-12 col-md-6']/div[4]/a/span"));
          proc.click();
	
         
		   

	}

}
