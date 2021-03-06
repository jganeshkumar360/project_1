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
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel_Task {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
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
	     Thread.sleep(2000);
	     //location select
	     WebElement locations = driver.findElement(By.xpath("//select[@name='location']"));
	     Select locat=new Select(locations);
	     locat.selectByVisibleText("Melbourne");
	     Thread.sleep(1000);
	     //hotel select
	     WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	     Select hotels=new Select(hotel);
	     hotels.selectByIndex(3);
	     Thread.sleep(1000);
	     //roon type
	     WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
	     Select room = new  Select (type);
	     room.selectByIndex(3);
	     Thread.sleep(1000);
	     //room numbers
	     WebElement numbers = driver.findElement(By.xpath("//select[@name='room_nos']"));
	     Select count = new Select(numbers);
	     count.selectByIndex(6);
	     Thread.sleep(1000);
	     //checkin
	     WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	     checkin.clear();
	     checkin.sendKeys("12/12/2012");
	     Thread.sleep(1000);
	     //checkout
	     WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	     checkout.clear();
	     checkout.sendKeys("15/12/2012");
	     Thread.sleep(1000);
	     //adultrooms
	     WebElement adultroom = driver.findElement(By.id("adult_room"));
	     Select romscount = new Select(adultroom);
	     romscount.selectByIndex(2);
	     Thread.sleep(1000);
	     //childrensroom
	     WebElement childrenroom = driver.findElement(By.id("child_room"));
	     Select romscount2 = new Select(childrenroom);
	     romscount2.selectByIndex(2);
	     Thread.sleep(1000);
	     //search
	     WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	     search.click();
	     Thread.sleep(1000);
	     //select hotel
	     WebElement dot = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	     dot.click();
	     Thread.sleep(1000);
	     //continue
	     WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	     submit.click();
	     Thread.sleep(1000);
	     //firstname
	     WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	     firstname.sendKeys("Ganesh");
	     Thread.sleep(1000);
	     //lastname
	     WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	     lastname.sendKeys("K");
	     Thread.sleep(1000);
	     //Adress
	     WebElement adress = driver.findElement(By.id("address"));
	     adress.sendKeys("11" + "Thiruvalluar Street" + "Ramapuram" + "Chennai-89");
	     Thread.sleep(1000);
	     //card nuber
	     WebElement cardnum = driver.findElement(By.id("cc_num"));
	     cardnum.sendKeys("9940054543123456");
	     Thread.sleep(1000);
	     //cardtype
	     WebElement cardtype = driver.findElement(By.id("cc_type"));
	     Select crdittype = new Select(cardtype);
	     crdittype.selectByIndex(2);
	     Thread.sleep(1000);
	     //month
	     WebElement month = driver.findElement(By.id("cc_exp_month"));
	     Select selmonth = new Select (month);
	     selmonth.selectByIndex(5);
	     Thread.sleep(1000);
	     //year
	     WebElement year = driver.findElement(By.id("cc_exp_year"));
	     Select selyear = new Select (year);
	     selyear.selectByIndex(7);
	     Thread.sleep(1000);
	     //ccv
	     WebElement ccv = driver.findElement(By.id("cc_cvv"));
	     ccv.sendKeys("786");
	     Thread.sleep(1000);
	     //Booknow
	     WebElement Booknow = driver.findElement(By.xpath("//input[@type='button']"));
	     Booknow.click();
	     Thread.sleep(5000);
	     //Screenshot
         TakesScreenshot ts = (TakesScreenshot) driver;
		 File source =ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File ("C:\\Users\\Ganesh\\eclipse\\java-2019-06\\Selenium\\Screenshot\\adactin.png");
		 FileUtils.copyFile(source, destination);
	     //Logout
	     WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
	     logout.click();
	     driver.close();
	     
		
		
		
	}

}
