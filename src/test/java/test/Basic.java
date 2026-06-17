package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.beust.jcommander.Parameter;

import pages.RegisterPage;
import utilities.DriverFactory;
import utilities.DriverManager;
import utilities.WaitUtilties;

public class Basic extends Base.base{
	
	WebDriver driver;
	
	@BeforeSuite
	public void startsuite()
	{
		initializeReport();
	}
	
	@AfterSuite
	public void stopSuite()
	{
		flushReport();
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		DriverFactory.initializeDriver(browser);
		
		driver = DriverManager.getDriver();
	}
	
	@Test(priority = 0)
	public void registerTest()
	{
		
		ExtentTest test = extent.createTest("Verify user is register");
		
		navigateToUrl("https://new.demozab.com/bitnexus/userpanel/signup");
		
		WaitUtilties.waitForElementVisible(By.xpath("//h3[.='Sign Up']"));
		
		RegisterPage r = new RegisterPage(driver);
		
		r.getUsername().sendKeys("jaishreenaatth");
		
		r.getEmail().sendKeys("jai@mailinator.com");
		
		r.getPassword().sendKeys("Shree@123");
		
		r.getConfirmpassword().sendKeys("Shree@123");
		
	//	elementClick(r.getCheckbox());
		
		
	}
	
}
