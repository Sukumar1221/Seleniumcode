package com.rameshsoft.automation.utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsTest {
public static void main(String[] args) {
	//beforetest
	ExtentReports extentReports = new ExtentReports("E:\\MyWorkspace\\830amframeworks\\Reports\\report.html");
	
	//beforemethod
	ExtentTest extentTest = extentReports.startTest("plzpractice");
	//test case level
	extentTest.log(LogStatus.INFO, "Browser is opened");;
	extentTest.log(LogStatus.INFO, "URL is entered as: www.gmail.com");
	extentTest.log(LogStatus.INFO, "DTA is done on username with testdata: plz practice");
	;;;;;;;;;;;;;;;;
	//aftermethod
	extentReports.endTest(extentTest);
	//aftermethod
	extentReports.flush();
	//aftertest
	extentReports.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
