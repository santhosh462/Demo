package com.Van;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://automationpractice.com/index.php?controller=my-account");
		   driver.manage().window().maximize();
		   
		   WebElement log = driver.findElement(By.xpath("//input[@id='email']"));
		   log.sendKeys("santhoshpadmanaban462@gmail.com");
		   WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		   pass.sendKeys("8883996101");
		   WebElement sign = driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]/span"));
		   sign.click();
		   
		   
		   Actions a=new Actions(driver);
		   WebElement dress= driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		   a.moveToElement(dress).build().perform();
		   WebElement eve=driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=10&controller=category'])[2]"));
           eve.click();
           Actions a1=new Actions(driver);
           WebElement cart=driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
           a1.moveToElement(cart).build().perform();
           WebElement more = driver.findElement(By.xpath("//div[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span"));
           more.click();
           driver.findElement(By.xpath("//p[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
           WebElement drop = driver.findElement(By.xpath("//select[@id='group_1']"));
           Select s1=new Select(drop);
           s1.selectByValue("1");
           driver.findElement(By.xpath("//ul[@id='color_to_pick_list']/li[2]")).click();
           driver.findElement(By.xpath("//p[@id=\"add_to_cart\"]/button/span")).click();
           driver.switchTo().defaultContent();
           Thread.sleep(5000);
           driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
           driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
           WebElement text = driver.findElement(By.xpath("//textarea[@class='form-control']"));
           text.sendKeys("please try to deliver with in a week");
           driver.findElement(By.xpath("(//button[@type='submit'])[2]/span")).click();
           driver.findElement(By.xpath("//input[@type='checkbox']")).click();
           driver.findElement(By.xpath("//form[@id=\"form\"]/p/button/span")).click();
           driver.findElement(By.xpath("//a[@class='bankwire']")).click();
           driver.findElement(By.xpath("(//button[@type='submit'])[2]/span")).click();
         File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           File destination=new File("./mini1/img.png");
           FileHandler.copy(source,destination);
           
          
           
          
           
	
	
	}          
	}
