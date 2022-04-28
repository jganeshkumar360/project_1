package Annotations_1;


   
	import org.testng.annotations.Test;

	public class Groups_Concept {
		
		@Test (groups = "Books")
		private void books() {
			System.out.println("Books");
			
		}
		
		
		@Test (groups = "Socialmedia")
		private void whatsapp() {
			System.out.println("whatsapp");	

		}
		
		@Test(groups = "Socialmedia")
		private void instagram() {
			System.out.println("instagram");
			
		}
		
		@Test(groups = "Music")
		private void Wynkmusic() {
			System.out.println("Wyunkmusic");
			
		}
		
		@Test(groups = "Music")
		private void spotify() {
			System.out.println("spotify");
		

		}
		
		
		
		
		

	}


