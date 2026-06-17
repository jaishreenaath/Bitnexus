package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilties {
	
	
	public static void waitForElementClick(By locator)
	{
		WebDriverWait wait  = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void waitForElementVisible(By locator)
	{
		WebDriverWait wait  = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
