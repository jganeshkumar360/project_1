package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adaction_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://adactinhotelapp.com/");
	     driver.manage().window().maximize();
	     //username
	     WebElement usrname = driver.findElement(By.id("username"));
	     usrname.sendKeys("Ganesh360");
	     //password
	     WebElement password = driver.findElement(By.id("password"));
	     password.sendKeys("9940054543");
	     //login
	     WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	     login.click();
	     //location select
	     WebElement locations = driver.findElement(By.xpath("//select[@name='location']"));
	     Select locat=new Select(locations);
	     locat.selectByVisibleText("Melbourne");
	     //hotel select
	     WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	     Select hotels=new Select(hotel);
	     hotels.selectByIndex(3);
	     //roon type
	     WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
	     Select room = new  Select (type);
	     room.selectByIndex(3);
	     //room numbers
	     WebElement numbers = driver.findElement(By.xpath("//select[@name='room_nos']"));
	     Select count = new Select(numbers);
	     count.selectByIndex(6);
	     //checkin
	     WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	     checkin.clear();
	     checkin.sendKeys("12/12/2012");
	     //checkout
	     WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	     checkout.clear();
	     checkout.sendKeys("12/01/2013");
	     //adultrooms
	     WebElement adultroom = driver.findElement(By.id("adult_room"));
	     Select romscount = new Select(adultroom);
	     romscount.selectByIndex(2);
	     //childrensroom
	     WebElement childrenroom = driver.findElement(By.id("child_room"));
	     Select romscount2 = new Select(childrenroom);
	     romscount2.selectByIndex(2);
	     //search
	     WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	     search.click();
	    
	     
	     
	     
	     
	     
	     Thread.sleep(5000);
	     driver.close();
	     
		
		
		
	}

}
