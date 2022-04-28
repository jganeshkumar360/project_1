package com.browserlaunch;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Task {
	

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		submit.click();
		Thread.sleep(2000);
		    
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("ganesh");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("kumar");
		Thread.sleep(2000);
		
		WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobilenumber.sendKeys("1234567890");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("vanakkamchennai");
		Thread.sleep(3000);
		
		WebElement singup = driver.findElement(By.name("websubmit"));
		singup.click();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\Ganesh\\eclipse\\java-2019-06\\Selenium\\Screenshot\\output.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
		driver.close();		
	
	  
	   
		
		
	
	
	}

}
