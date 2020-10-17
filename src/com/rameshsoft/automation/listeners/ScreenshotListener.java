package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class ScreenshotListener implements ITestListener{
	
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("test suite is completed");
	}
	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("TEST SUITE IS STARTED");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
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
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("CURRENTLY EXECUTING TC IS: " +arg0.getName());
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("TC IS PASSED : " +arg0.getName());
	}

}
