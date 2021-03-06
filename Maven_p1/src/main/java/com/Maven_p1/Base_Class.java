package com.Maven_p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	public static String value;
	
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dri") +  "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dri") +  "\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().fullscreen();
		return driver;
	}
	
	public static void clickElement(WebElement element) {
		element.click();
		
	}
	 
	public static void passtheValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	private static void SelectbyDropdown(String type, WebElement element, String value) {
		try {
			
			Select s = new Select(element);
			
			if (type.equalsIgnoreCase("ByValue")) {
				s.selectByValue(value);
			}
			
			else if (type.equalsIgnoreCase("ByIndex")) {
				int i = Integer.parseInt(value);
				s.selectByIndex(i);
			}
			
			else if (type.equalsIgnoreCase("ByText")) {
				s.selectByVisibleText(value);
				
			}
			
			} catch (Exception e) {
				e.printStackTrace();
		}
}
	
	   private static void close() {
	    	driver.close();
	}
	   
	   private static String particular_data( String path, int row_index, int cell_index) throws IOException {
		   File f = new File(path);
		   FileInputStream fis = new FileInputStream(f);
		   Workbook w = new XSSFWorkbook(fis);//upcasting
		   org.apache.poi.ss.usermodel.Sheet sheetAt = w.getSheetAt(0);
		   Row row = sheetAt.getRow(row_index);
		   org.apache.poi.ss.usermodel.Cell cell = row.getCell(cell_index);
		   org.apache.poi.ss.usermodel.CellType celltype = cell.getCellType();
		   
		   if (celltype.equals(celltype.STRING)) {
			   value = cell.getStringCellValue();
			   }
		   else if (celltype.equals(celltype.NUMERIC)) {
			   double numericCellValue = cell.getNumericCellValue();
			   int val = (int) numericCellValue;
			   value = String.valueOf(val);
			
		}
		return value;
		    
		   
		   
		   
		   
		   
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
