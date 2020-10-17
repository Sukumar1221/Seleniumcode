package com.rameshsoft.automation.gmail.scripts;

import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.pageobjects.Gmail_Home_Page;
import com.rameshsoft.automation.pageobjects.Gmail_Pwd_Page;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReader;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_POM_Test extends BaseEngine {

	@Test
	public void gmail_Test() throws Exception {
		PropertiesReader prConf = new PropertiesReader(FilePaths.getConfFilePath());
		String url = prConf.getPropertyValue("preprod_url");
		getDriver().get(url);
		
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " +url);
		
		ExcelReader excelReader = new ExcelReader(FilePaths.getExcelFilePath());
		String unData = excelReader.getSingleCellData("java", 0, 0);
		Gmail_Home_Page.enterUserName(unData);
		
		Gmail_Home_Page.clickOnNextBtn();
		
		String pwdData = excelReader.getSingleCellData("java", 0, 1);
		Gmail_Pwd_Page.enterPassword(pwdData);
		
		Gmail_Pwd_Page.clickOnNextBtn();
		
		Assert.assertEquals(Gmail_Pwd_Page.getWrngPwdErrorMsg(), "Wrong password. Try again or click Forgot password to reset it.");
	}
	
}
