package Annotations_1;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	
	
	private void username() {
		
		String exp_Username = "Starc";
		
		String actual_Username = "Starc123";
		
		SoftAssert soft = new SoftAssert();
		
		Assert.assertEquals(actual_Username, exp_Username);
		
		System.out.println("Assert Validation");
		
		

	}
	
	
	
	
	

}
