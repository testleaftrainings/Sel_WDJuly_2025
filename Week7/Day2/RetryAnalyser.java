package week7.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	int count = 0;

	public boolean retry(ITestResult result) {
		// 3<3
		if (count < 3) {
			count++; // 3
			return true; 
		}

		return false;

	}

}
