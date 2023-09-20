package Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome,driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 (5)\\chromedriver.exe");		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver = new ChromeDriver(opt);
//		driver.get("https://www.amazon.in/");
//	//	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("(//a[@data-nav-role=\"signin\"])[3]")).click();
//	
//	}
	
	protected WebDriver driver;
	
	@BeforeClass
	public WebDriver driverInitialization() 
	{
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 (5)\\chromedriver.exe");		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(opt);
		driver.get("https://jqueryui.com/slider/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	// to get the title	
		String title = driver.getTitle();
		System.out.println(title);
		return driver;
	
	}
	
	
	
	



}
