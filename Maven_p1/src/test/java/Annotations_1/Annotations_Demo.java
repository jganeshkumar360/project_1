package Annotations_1;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	
	
	@BeforeTest
	private void Browser_Launch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");

	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");

	}
	
	@Test
	private void Childern() {
		System.out.println("Children");

	}
	
	@Test
	private void Women() {
		System.out.println("Women");	
	
	}
	 
	@BeforeMethod
	private void singin() {
		System.out.println("Singin");
	
	}
	
	@AfterMethod
	private void singout() {
		System.out.println("Sing Out");

	}
	
	@Test
	private void men() {
		System.out.println("Men");
		
	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete All Cookies");

	}
	
	

}
