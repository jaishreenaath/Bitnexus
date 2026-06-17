package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.DriverManager;

public class base {
	
	public static ExtentSparkReporter spark;
	
	public static ExtentReports extent;
	
	public static void initializeReport()
	{
		spark = new ExtentSparkReporter("./Reports/Basic.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Project", "Bitnexus");
		
		extent.setSystemInfo("Tester", "Jaishreenaatth");
		
		extent.setSystemInfo("Environment", "Demo");
		
		extent.setSystemInfo("OS", "Windows");
				
	}
	
	public static void flushReport()
	{
		extent.flush();
	}
	
	public static void navigateToUrl(String url)
	{
		DriverManager.getDriver().get(url);
	}
	
	public static void elementClick(WebElement element)
	{
		element.click();
	}
	
	public static void waitForMilliSeconds(int seconds)
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static WebElement getElementId(String id)
	{
		return DriverManager.getDriver().findElement(By.id(id));
	}
	
	public static WebElement getElementName(String name)
	{
		return DriverManager.getDriver().findElement(By.name(name));
	}
	
	public static WebElement getElementXpath(String xpath)
	{
		return DriverManager.getDriver().findElement(By.xpath(xpath));
	}

	

}
