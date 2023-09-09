package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	//declaration
	@FindBy(xpath="//input[@type=\"text\"]") 
	private WebElement Search;

	//click on draggable
	@FindBy(xpath="//a[text()=\"Draggable\"]")
	private WebElement drag;
	
	//Count total number of headerLinks present
	@FindBy(xpath="//ul[@id=\"menu-top\"]")
	private WebElement Links;
	
	// switch selenium focus to iframe
	@FindBy(xpath="//iframe[@class=\"demo-frame\"]")
	private WebElement SwitchIframe;
	
	//Action on iframe
	@FindBy(xpath="//div[@id=\"draggable\"]")
	private WebElement draggable;
	
	//click on Accordian Button
	@FindBy(xpath="(//aside[@class=\"widget\"])[2]/ul/li[1]")
	private WebElement Accordian;
	
	//click on themes
	@FindBy(xpath="//a[text()=\"Themes\"]")
	private WebElement themes;
	
	//Send Text to Autocomplet
	@FindBy(xpath="//input[@id=\"autocomplete\"]")
	private WebElement AutoText;
	
	// Click on Radio button of Insurance
	@FindBy(xpath="//label[@for=\"insurance\"]")
	private WebElement RadioBtn;
	
	//Click on jquery Ui Icon
	@FindBy(xpath="//a[@href=\"https://www.manning.com/books/jquery-ui-in-action\"]")
	private WebElement UiJqr; 
	
	
	
	
	
//----------------	
	
	//initialization
	public HomePage(WebDriver driver) {      
        PageFactory.initElements(driver, this);
    }
	
	
	
//----------------	
	
	
//usage	
	public void SearchBox()
	{
		Search.sendKeys("ABC");;
	}
	
	public void clickondraggable()
	{
		drag.click();
	}
   
	public void CountAndClickLink() 
	{
		System.out.println(Links.getSize());
	}
	
	public void DragAndDrop()
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggable, 100, 80);
	}
	
	public void ClickOnAccordian()
	{
		Accordian.click();		
	}
	
	public void Themes()
	{
		themes.click();
	}
	
	public void AutoText()
	{
		AutoText.sendKeys("Shaikh Juned");
	}
	
	public void RadioButton()
	{
		RadioBtn.click();
	}
	
	
	
	public void JqueryUI()
	{
		UiJqr.click();
	}
	

}
