package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//declaration
	@FindBy(xpath="//input[@type=\"text\"]") private 
	WebElement Search;
	
	
	
	//initialization
	
	public HomePage(WebDriver driver) {      
        PageFactory.initElements(driver, this);
    }
	
	
	//usage
	public void SearchBox()
	{
		Search.sendKeys("ABC");;
	}
	
	
   
	

}
