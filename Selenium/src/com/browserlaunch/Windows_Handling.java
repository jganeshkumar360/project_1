package com.browserlaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		Actions g = new Actions(driver);
		
		WebElement todaysdeal = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		
		g.contextClick(todaysdeal).build().perform();
		
		Robot a = new Robot();
		
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement CustomerService = driver.findElement (By.xpath("//a[contains(text(),'Customer Service')]"));
		g.contextClick(CustomerService).build().perform();
		
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Electronics = driver.findElement(By.xpath("//a[contains(text(),' Electronics ')]"));
		g.contextClick(Electronics).build().perform();
		

		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Books = driver.findElement(By.xpath("//a[contains(text(),'Books')][1]"));
		g.contextClick(Books).build().perform();
		

		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Fashion = driver.findElement(By.xpath("//a[contains(text(),'Fashion')][1]"));
		g.contextClick(Fashion).build().perform();
		

		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		
		//size of window
		
		int size = driver.getWindowHandles().size();
		
		System.out.println("Totoal Window Count :"+ size);
		
		//Parent Id
		
		String parentid = driver.getWindowHandle();
		System.out.println("parent_id:"+parentid);
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
