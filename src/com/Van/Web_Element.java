package com.Van;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
        driver.manage().window().maximize();
        
        List<WebElement> tab = driver.findElements(By.xpath("//table/tbody/tr/td"));
        
        for (WebElement WebElement :tab) {
        	System.out.println(WebElement.getText());
        }	
        	System.out.println("");
         List<WebElement> list1 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (WebElement webElement : list1) {
        	System.out.println(webElement.getText());
			}
        System.out.println("");
        List<WebElement> list2 = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement webElement : list2) {
        	System.out.println(webElement.getText());
		}
        System.out.println("");
        WebElement list3 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		System.out.println(list3.getText());
		
        System.out.println("");
        List<WebElement> list4 = driver.findElements(By.xpath("//th"));
        for (WebElement webElement : list4) {
	    System.out.println(webElement.getText());
	           
	

		}	}
	
		
		
			
		
}
	


