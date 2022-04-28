package Annotations_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test (dataProvider = "test_data") //ready to buy data from data_provider
	private void adactin_Runne(String username, int password) {
		
		System.out.println("username :" + username);
		
		System.out.println("password :" + password);
	}
	
	
	@DataProvider // ready to give datas
	
	private Object[][] test_data() {
		
		return new Object [][] {
			
			{"ganguly", 99400},
			
			{"Sachine", 54543},
			
			{"dravid", 545},
		};
		
	}	
	
	@Test (dataProvider = "test_data")
	private void automation_Runner(String username, int password) {
		
		System.out.println("Username in automation :" + username);
		
	    System.out.println("Password in automation :" + password);
		

	}

}
