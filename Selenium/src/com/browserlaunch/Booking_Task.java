package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	     driver.manage().window().maximize();
		
	    Thread.sleep(5000);
		 
		 WebElement creat = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		 creat.click();
		 

		
		
	}

}
