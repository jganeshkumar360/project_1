package com.browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
public static void main(String[] args) throws InterruptedException {
	

	
	System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +"/driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.id("dropdown1"));
    Select s = new Select(dropdown);
    Thread.sleep(2000);
    
    // Single Dropdown - byIndex, byValue, byVisbletext
  
    s.selectByIndex(1);
    Thread.sleep(2000);
    
    s.selectByValue("2");
    Thread.sleep(2000);
    
    s.selectByVisibleText("Loadrunner");
    Thread.sleep(2000);
    
    List<WebElement> getsizer = s.getOptions();
    int size = getsizer.size();
    System.out.println("size of dropdown:"+size);
    
    //***************  Multiple Drop Down  **********************\\
    
    WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
    Select multip = new Select(multiple);
    boolean multipledropdown = multip.isMultiple();
    System.out.println("Multiple Or Not:" +multipledropdown);
    
    System.out.println("************************ Multiple dropdown ***************************");
    
    List<WebElement> multi_size = multip.getOptions();
    int size_multi = multi_size.size();
    System.out.println("mutiple dropdown size:"+ size_multi);
    
    
    //for (datatype eachitem:variable)
    
    
    for(WebElement g:multi_size) {
    	System.out.println(g.getText());
    
    }
    for (int i = 0; i < size_multi; i++) {
    	
    	if (i==2 | i==3 | i==4) {
    		
    		
    		multip.selectByIndex(i);
    		
    	}
    
    }
    
    List<WebElement> select = multip.getAllSelectedOptions();
    for (WebElement i:select ){
    System.out.println(i.getText());
    	
	}
     WebElement first = multip.getFirstSelectedOption();
     System.out.println(first.getText());
     
    
    }

	
}

