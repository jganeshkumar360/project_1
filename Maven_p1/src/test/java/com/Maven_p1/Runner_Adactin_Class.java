package com.Maven_p1;

import org.openqa.selenium.WebDriver;

import com.task.Page_Object_Manager;

public class Runner_Adactin_Class extends Base_Class{
	
	private static WebDriver driver = browser_configuration("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) {
		
		driver = browser_configuration("Chrome");
		geturl("https://adactinhotelapp.com/");
		
		
		//Login_1 11 = new Login (driver)
		
		passtheValueElement(pom.get_instance_l1().username(), "Ganesh360");
		passtheValueElement(pom.get_instance_l1(), .getpassword(), "54OF15");
		clickElement(pom.get_instance_l1()).getlogin());
		
		// Details_p1 = new Details_p1 (driver)
		
		selectbyDropdown("ByValue", pom.get_instance_dp1().getlocation(), "London");
		selectbyDropdown("ByValue", pom.get_instance_dp1().gethotels(), "Hotel Cornice");
		selectbyDropdown("ByVisbleText", pom.get_instance_dp1().getroom_type(), "Deluxe");
		selectbyDropdown("ByValue", pom.get_instance_dp1().getroom_nos(), "10");
		Thread.sleep(2000);
		
		passtheValueElement(pom.get_instance_dp1().getdatapick_in(), "20/05/2022");
		passtheValueElement(pom.get_instance_dp1().getdatapick_in(), "22/05/2022");
		
		selectbyDropdown("ByValue", pom.get_instance_dp1().getadult_room(), "3");
		selectbyDropdown("ByVisbleText", pom.get_instance_dp1().getchild_room(), "3_Three");
		clickElement(pom.get_instance_dp1().getsubmit());
		
		//select _p1 dp1 = new Select_p1 (driver)
		
		clcikElement(pom.get_instance_sp1().getbutton1());
		clcikElement(pom.get_instance_sp1().getcountinue());
		 
		// payment_d1 pd1 = new Paymnet_d1 (driver)
		
		passtheValueElement(pom.get_instance_pd1().getfirst_name(), "Ganesh");
		passtheValueElement(pom.get_instance_pd1().getlast_name(), "Kumar");
		passtheValueElement(pom.get_instance_pd1().getaddress(), "Ramapuram");
		passtheValueElement(pom.get_instance_pd1().getcc_num(), "123");
		selectbyDropdown
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

	

}
