package Annotations_1;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	
	@Test(enabled = false) // default value is true
	private void books() {
		System.out.println("Books");
		
	}
	
	@Ignore
	@Test (priority = 1)
	private void whatsapp() {
		System.out.println("whatsapp");	

	}
	
	@Test(priority = 2)
	private void instagram() {
		System.out.println("instagram");
		
	}
	
	@Test
	private void Wynkmusic() {
		System.out.println("Wyunkmusic");
		
	}
	
	@Test
	private void spotify() {
		System.out.println("spotify");
	

	}
	
	
	
	
	

}
