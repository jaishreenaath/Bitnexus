package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		int count =0;
		
		int retry=2;
		
		if(retry>count)
		{
			count++;
			
			return true;
		}
		
		return false;
	}

}
