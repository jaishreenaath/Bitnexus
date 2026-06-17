package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static void initializeDriver(String browser)
	{
		
		if(DriverManager.getDriver()==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions ch = new ChromeOptions();
				
				ch.addArguments("--start-maximized");
				
				driver = new ChromeDriver(ch);
								
				DriverManager.setDriver(driver);
			}
			
			else if(browser.equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				
				FirefoxOptions f = new FirefoxOptions();
				
				f.addArguments("--start-maximized");
				
				driver = new FirefoxDriver();
				
				DriverManager.setDriver(driver);
				
			}
		}
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public static void quitDriver()
	{
		if(DriverManager.getDriver()!=null)
		{
			DriverManager.getDriver().quit();
			
			DriverManager.removeDriver();
		}
	}

}
