package com.browserlaunch;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//symple alert
		
		WebElement simple_alert= driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		simple_alert.click();
		Thread.sleep(2000);
	
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		submit.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//confirm alert   
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm_alert.click();
		Thread.sleep(2000);
		
		WebElement dismiss = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		dismiss.click();
		Thread.sleep(2000);
		
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		Thread.sleep(2000);
		
		//prompt alert
		
		WebElement prompt_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt_alert.click();
		Thread.sleep(2000);
		
		WebElement prompt_key = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt_key.click();
		Thread.sleep(2000);
		
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Vanakkam Chennai");
		Thread.sleep(2000);
		prompt.accept();
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
