package com.rameshsoft.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseEngine;

public class Gmail_Home_Page extends BaseEngine {

	static
	{
		PageFactory.initElements(getDriver(), Gmail_Home_Page.class);
	}
	
	@FindBy(id="identifierId")
	static private WebElement userName;
	
	@FindBy(how = How.ID,id="identifierId")
	static private WebElement userName2;
	
	@FindBy(how=How.NAME,name="identifier")
	static private WebElement userName1;
	
	@FindBy(how = How.ID,id="identifierNext")
	static private WebElement next;
	
	@FindBy(how = How.XPATH,xpath="//button[contains(text(),'Forgot email?')]")
	static private WebElement frgtEmail;
	
	@FindBy(how = How.XPATH,xpath="//span[contains(text(),'Create account')]")
	static private WebElement createAcc;
	
	
	public static void enterUserName(String testData) {
		Assert.assertTrue(userName.isDisplayed()&&userName.isEnabled());
		userName.clear();
		userName.sendKeys(testData);
	}
	
	public static void clickOnNextBtn() {
		Assert.assertTrue(next.isDisplayed()&&next.isEnabled());
		next.click();
	}
	
	public static void clickOnFrgtEmail(){
		frgtEmail.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
