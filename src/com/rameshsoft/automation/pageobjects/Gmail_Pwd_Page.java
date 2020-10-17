package com.rameshsoft.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseEngine;

public class Gmail_Pwd_Page extends BaseEngine{

	static WebDriver driver ;
	
	public static void getDriverObj() {
		driver = getDriver();
	}

	public static void enterUN(String un) {
		driver.findElement(By.id("identifierId")).sendKeys(un);
	}
	
	@FindBy(name="password")
	static private WebElement password;
	
	@FindBy(how = How.NAME,id="password")
	static private WebElement password1;
	
	@FindBy(how = How.XPATH,xpath="//span[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]")
	static private WebElement wrongPwd;
	
	
	@FindBy(how = How.ID,id="passwordNext")
	static private WebElement next;
	
	@FindBy(how = How.XPATH,xpath="//span[contains(text(),'Forgot password?')]")
	static private WebElement frgtPwd;
	
	public static void enterPassword(String testData) {
		password.clear();
		password.sendKeys(testData);
	}
	
	public static void clickOnNextBtn() {
		next.click();
	}
	
	public static void clickOnFrgtPwd(){
		frgtPwd.click();
	}
	static
	{
		PageFactory.initElements(getDriver(), Gmail_Pwd_Page.class);
	}
	
	public static String getWrngPwdErrorMsg() {
		Assert.assertTrue(wrongPwd.isDisplayed()&&wrongPwd.isEnabled());
		String errMsg = wrongPwd.getText();
		return errMsg;
	}
}











