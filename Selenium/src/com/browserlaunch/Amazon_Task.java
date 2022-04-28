package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement Search_Bar = driver.findElement(By.id("twotabsearchtextbox"));
		Search_Bar.click();
		Search_Bar.sendKeys("oneplus");
		Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.xpath("//input[@type='submit']"));
		Search.click();
		
		WebElement oneplus = driver.findElement(By.xpath("//img[@class='s-image'][1]"));
		oneplus.click();
		
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		
		
		WebElement Addcart = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
		Addcart.click();
		
		
		
		
		
		
	}

}
