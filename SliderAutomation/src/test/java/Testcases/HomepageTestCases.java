package Testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Driver.Base;
import Pages.HomePage;

public class HomepageTestCases extends Base {
	
	@Test
	public void AmazonSignInClick() {
		HomePage hp = new HomePage(driver);
		hp.SearchBox();
		
	}
	
	
	
	
	
	

}
