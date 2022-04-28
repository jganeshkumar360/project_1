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

public class Facebook_Test {
	

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
		//Thread.sleep(3000);
        
		String title = driver.getTitle();
	    System.out.println("title"+ title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("currenturl"+ currentUrl);
	    
	    WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("atoxyz@gmail.com");
	    
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("1234567890");
	  
	    WebElement submit = driver.findElement(By.name("login"));
	    submit.click();
	    
	    Thread.sleep(5000);
	    
	    
	    
		
	   // String pagesource = driver.getPageSource();
	   // System.out.println(pagesource);
	    
	   // driver.navigate().to ("https://www.flipkart.com/");
	    
	    //driver.navigate().back();
	   // Thread.sleep(2000);
	   // driver.navigate().refresh();
	    
	   // driver.navigate().forward();
	   // Thread.sleep(2000);
	   
	    
	    TakesScreenshot ts = (TakesScreenshot) driver; 
	    File Source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File ("./Screenshot\\finally2.png");
	    FileUtils.copyFile   (Source, destination);
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}
	
	
	
	
	

}
