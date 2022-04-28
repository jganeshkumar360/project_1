package Annotations_1;

import org.testng.annotations.Test;

public class InvocationCount_Concept {
	
	@Test (priority = -1)
	private void browser_launch() {
		System.out.println("Browser Launch");
	}
	
	@Test
	private void launch_url() {
		System.out.println("Launch Url");
    }
	  
	@Test(priority = 1, invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh"); 
    }
	
	@Test(priority = 2)
	private void credentials() {
		System.out.println("Crdentials");
	}
	
	

}
