package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseEngine {
	
static private WebDriver driver;
private static String curDir;
private static String tcName;
private static ExtentReports extentReports;
private static ExtentTest extentTest;

    @Parameters("browser")
    @BeforeSuite
	public void openBrowser(@org.testng.annotations.Optional("chrome")String browser) {
		curDir = System.getProperty("user.dir");
       	if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", curDir+"\\Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			driverInit();
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", curDir+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driverInit();
		}
        else if (browser.equalsIgnoreCase("firefox")) {
        	System.setProperty("webdriver.gecko.driver", curDir+"\\Drivers\\chromedriver.exe");
        	driver = new FirefoxDriver();
			driverInit();
		}
        else if (browser.equalsIgnoreCase("chromeheadless")) {
        	System.setProperty("webdriver.chrome.driver", curDir+"\\Drivers\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriver driver = new ChromeDriver(chromeOptions);
        	driverInit();
		}
	}
    @AfterSuite
	public void closeBrowser() {
		Optional<WebDriver> optional = Optional.ofNullable(driver);
		if (optional.isPresent())
			driver.close();
		else
			System.out.println("DRIVER IS PONTING TO NULL VALUE");		
	}
    @BeforeMethod
    public void beforeTCExecution(Method method) {
    	tcName = method.getName();
		System.out.println("CURRENTLY EXECUTING TC IS: " +tcName);
		extentTest = extentReports.startTest(tcName);
	}
    @AfterMethod
    public void afterTCExecution(ITestResult result) throws IOException {
    	String tcName = result.getName();
    	
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("TC IS PASSED: " +tcName);
			extentTest.log(LogStatus.PASS, "TC IS PASSED: " +tcName);
		}
		else if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("TC IS FAILED SO TAKING SCREENSHOT: " +tcName);
			String imagePath = ScreenshotUtility.screenshot();
			extentTest.log(LogStatus.FAIL, "TC IS FAILED: " +tcName);
			extentTest.log(LogStatus.FAIL, result.getThrowable());
			extentTest.addScreenCapture(imagePath);
		}
		else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("TC IS SKIPPED: " +tcName);
			ScreenshotUtility.screenshot();
			extentTest.log(LogStatus.SKIP, "TC IS SKIPPED: " +tcName);
		}
		System.out.println("TC EXECUTION IS ENDED: " +tcName);
		extentReports.endTest(extentTest);
		extentReports.flush();
		
	}
    @BeforeTest
    public void reportInit() {
    	extentReports = new ExtentReports(curDir+"\\Reports\\report.html");
	}
    @AfterTest
    public void endReport() {
		extentReports.close();
	}
	private void driverInit()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static String getCurDir() {
		return curDir;
	}
	public static String getTcName() {
		return tcName;
	}
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}

