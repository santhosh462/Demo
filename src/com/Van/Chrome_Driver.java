package com.Van;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome..69i57j46i131i199i433i465i512j0i433i512j0i131i433i512l4j0i512j0i433i457i512.3356j0j15&sourceid=chrome&ie=UTF-8");
	}

}
