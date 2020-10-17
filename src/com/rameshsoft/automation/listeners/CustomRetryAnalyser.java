package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class CustomRetryAnalyser implements IRetryAnalyzer{

	int minCount = 0;
	int maxCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE&&minCount<=maxCount) {
			
			try {
				ScreenshotUtility.screenshot();
				minCount++;
				//return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

}
