package com.browserlaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
			
		Actions g= new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//a[@class='gb_d'][1]"));
		
		g.contextClick(email).build().perform();
		
         Robot a = new Robot();
         
         a.keyPress(KeyEvent.VK_DOWN);
         a.keyRelease(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         
         a.keyPress(KeyEvent.VK_DOWN);
         a.keyRelease(KeyEvent.VK_DOWN);
         
         
         a.keyPress(KeyEvent.VK_DOWN);
         a.keyRelease(KeyEvent.VK_DOWN);
         
         a.keyPress(KeyEvent.VK_ENTER);
         a.keyRelease(KeyEvent.VK_ENTER);
         
         
         
         
         
         
         
		
		
		
		
		
	}
	

}
