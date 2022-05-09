package com.Van;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\driver2\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/search?q=flipkart&oq=flip&aqs=chrome.0.0i131i433i512j69i57j0i131i433i512l2j0i512j0i131i433i512j0i433i512l2j0i512j0i271.2447j0j15&sourceid=chrome&ie=UTF-8");
      driver.manage().window().maximize();
	}

}
