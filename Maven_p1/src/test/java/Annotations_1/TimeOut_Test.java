package Annotations_1;

import org.testng.annotations.Test;

public class TimeOut_Test {

	
	@Test(timeOut = 8000) // actula time and add one sec extra
	private void browser_Execution() throws InterruptedException {
		
		Thread.sleep(2000); //browser launch
		
		System.out.println("Browser Launch");
		
		Thread.sleep(1000); //Url
		
		System.out.println("url launch");
		
		Thread.sleep(2000);
		
		System.out.println("Credential Entered");
		
		Thread.sleep(1000); // real static wait
		
		System.out.println("next page");
		

	}
	
	
}
