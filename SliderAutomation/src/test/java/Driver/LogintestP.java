package Driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Utilities.configReader;

public class LogintestP {

	WebDriver driver;
	@Test
	public void myloginp() throws Exception
	{
		configReader cf = new configReader();
		
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 (5)\\chromedriver.exe");		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(opt);
		
		driver.get(cf.geturl());	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// enter username
		driver.findElement(By.id("login-username")).sendKeys(cf.getUsername());
		
		// enter password
		driver.findElement(By.id("login-password")).sendKeys(cf.getPassword());
		
		//enter click
		driver.findElement(By.name("submit")).click();
		
		
	}
	
	
	
	
	
	
	
	
}
