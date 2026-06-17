package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtilities {

	public static String takeScreenshot()
	{
		TakesScreenshot tk = (TakesScreenshot)DriverManager.getDriver();
		
		return tk.getScreenshotAs(OutputType.BASE64);
	}
	
	
}
