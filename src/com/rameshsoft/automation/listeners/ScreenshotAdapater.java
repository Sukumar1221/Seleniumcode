package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class ScreenshotAdapater extends TestListenerAdapter{

	@Override
	public void onTestFailure(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
			System.out.println("TC IS FAILED SO TAKING SCREENSHOT: " +arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
			System.out.println("TC IS SKIPPED SO TAKING SCREENSHOT: " +arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
