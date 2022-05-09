package com.Van;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement user= driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys("8270968030");
        WebElement  pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("8883996101");
        WebElement login= driver.findElement(By.xpath("//input[@id='login']"));
        login.click();
        WebElement m1= driver.findElement(By.xpath("//select[@name='location']"));
        Select s1=new Select(m1);
        s1.selectByValue("Los Angeles");
        WebElement m2= driver.findElement(By.xpath("//select[@name='hotels']"));
        Select s2 = new Select(m2);
        s2.selectByValue("Hotel Sunshine");
        WebElement m3= driver.findElement(By.xpath("//select[@name='room_type']"));
        Select s3=new Select(m3);
        s3.selectByValue("Super Deluxe");
        WebElement m4= driver.findElement(By.xpath("//select[@name='room_nos']"));
        Select s4=new Select(m4);
        s4.selectByValue("5");
        WebElement date= driver.findElement(By.xpath("//input[@name='datepick_in']"));
        date.sendKeys("30/03/2022");
        WebElement date1= driver.findElement(By.xpath("//input[@name='datepick_out']"));
        date1.sendKeys("31/03/2022");
        WebElement m5= driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select s5=new Select(m5);
        s5.selectByValue("4");
        WebElement m6= driver.findElement(By.xpath("//select[@name='child_room']"));
        Select s6=new Select(m6);
        s6.selectByValue("1");
        WebElement confirm=driver.findElement(By.xpath("//input[@id='Submit']"));
        confirm.click();
        WebElement butto=driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
        butto.click();
        WebElement conti= driver.findElement(By.xpath("//input[@id='continue']"));
        conti.click();
        WebElement first= driver.findElement(By.xpath("//input[@name='first_name']"));
        first.sendKeys("SANTHOSH");
        WebElement last=driver.findElement(By.xpath("//input[@name='last_name']"));
        last.sendKeys("P");
        WebElement address=driver.findElement(By.xpath("//textarea[@name='address']"));
        address.sendKeys("Rajivnagar Dindigul");
        WebElement acc=driver.findElement(By.xpath("//input[@name='cc_num']"));
        acc.sendKeys("1111222233334444");
        WebElement type=driver.findElement(By.xpath("//select[@name='cc_type']"));
        Select s7 = new Select(type);
        s7.selectByValue("VISA");
        WebElement month=driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
        Select s8= new Select(month);
        s8.selectByValue("9");
        WebElement year=driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
        Select s9=new Select(year);
        s9.selectByValue("2022");
        WebElement ccv=driver.findElement(By.xpath("//input[@name='cc_cvv']"));
        ccv.sendKeys("444");
        WebElement book=driver.findElement(By.xpath("//input[@name='book_now']"));
        book.click();
        Thread.sleep(5000);
        WebElement itti=driver.findElement(By.xpath("//input[@name='my_itinerary']"));
        itti.click();
        
        File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("./snaps/img.png");
        FileHandler.copy(source,destination);
        
        
        
        
        
        
        
		

	}

}
