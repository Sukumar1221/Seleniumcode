package com.rameshsoft.automation.gmail.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.PropertiesReader;
import com.rameshsoft.automation.utilities.RegExUtility;
import com.relevantcodes.extentreports.LogStatus;

public class FB_Test extends BaseEngine{

	@Test
	public void fbTest() throws IOException {
		PropertiesReader prConf = new PropertiesReader("E:\\MyWorkspace\\830amframeworks\\config.properties");
		String url = prConf.getPropertyValue("fb_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL IS ENTERED AS: " +url);
		
		if(RegExUtility.isValidPhNum("9177791456")){
		
		getDriver().findElement(By.id("email")).sendKeys("9177791456");;
		}
		else{
			System.out.println("InValid ph number");
		}
	}
	
}













