package com.browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
	    String text = frame1.getText();
		System.out.println("frame 1 :"+text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		String text2 = frame2.getText();
		System.out.println("frame2:"+ text2);
		driver.switchTo().defaultContent();
		
		List<WebElement> frame_size_cnt = driver.findElements(By.tagName("iframe"));
		int size = frame_size_cnt.size();
		System.out.println("frame size :"+size);
		
		
		 
		
		
		
		
			
	}

}
