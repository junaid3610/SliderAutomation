package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import Driver.Base;
import Pages.HomePage;

public class HomepageTestCases extends Base {
	
	
	
	@Test(priority = 1)
	public void SliderSearchBox()
	{
		HomePage hp = new HomePage(driver);
		hp.SearchBox();		
	}
	
	@Test(priority = -1)
	public void draggableItems()
	{
		HomePage hp = new HomePage(driver);
		hp.clickondraggable();
	}
	
	@Test(priority = 2)
	public void TotalLinks()
	{
		HomePage hp = new HomePage(driver);
		hp.CountAndClickLink();
	}
	
	@Test(enabled = false)
	public void DragBox()
	{
		HomePage hp = new HomePage(driver);
		hp.DragAndDrop();
		
	}
	
	@Test(priority = 3)
	public void AccordianClick()
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnAccordian();
	}
	
	@Test(priority = 4)
	public void ClickOnThemes()
	{
		HomePage hp = new HomePage(driver);	
		hp.Themes();
	}
	
	@Test(priority = 5)
	public void AutoCompletetext()
	{
		HomePage hp = new HomePage(driver);
		hp.AutoText();
	}
	
	@Test(priority = 6)
	public void RadioInsuranceButton()
	{
		HomePage hp = new HomePage(driver);
		hp.RadioButton();
	}

	
	@Test(priority = 7)
	public void JqueryUIiconClick()
	{
		HomePage hp = new HomePage(driver);
		hp.JqueryUI();
	}
	
//	@Test(enabled = false)
//	public void HoverToLinks()
//	{
//		HomePage hp = new HomePage(driver);
//		hp.hover();
//	}
	
	
	@Test(priority = 8)
	public void ClickOnForwordScott()
	{
		HomePage hp = new HomePage(driver);
		hp.forwordclick();
	}
	
	
	@Test(priority = 9)
	public void ClickOnSignInBtn() 
	{
		HomePage hp = new HomePage(driver);	
		hp.SigIn();
		
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

