package com.rameshsoft.automation.gmail.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.PropertiesReader;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Test extends BaseEngine{

	@Test
	public void gmailLogin() throws IOException, EncryptedDocumentException, InvalidFormatException {
		PropertiesReader prConf = new PropertiesReader("E:\\MyWorkspace\\830amframeworks\\config.properties");
		String url = prConf.getPropertyValue("prod_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL IS ENTERED AS: " +url);
		
		getDriver().findElement(By.id("abc")).click();
		/*PropertiesReader prOr = new PropertiesReader("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\objectrepository\\OR_Gmial.properties");
		
		File file = new File("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("java");
		Row row1 = sheet.getRow(1);
		String cellVal1 = row1.getCell(0).getStringCellValue();
		String cellVal2 = row1.getCell(1).getStringCellValue();
		
		String gmail_un_id = prOr.getPropertyValue("gmail_un_id");
		String gmail_nxt_id = prOr.getPropertyValue("gmail_nxt_id");
		String gmail_pwd_name = prOr.getPropertyValue("gmail_pwd_name");
		String gmail_signin_id = prOr.getPropertyValue("gmail_signin_id");
		
			
		getDriver().findElement(By.id(gmail_un_id)).sendKeys(cellVal1);
		getDriver().findElement(By.id(gmail_nxt_id)).click();
		getDriver().findElement(By.name(gmail_pwd_name)).sendKeys(cellVal2);
		getDriver().findElement(By.id(gmail_signin_id)).click();*/
		
	}
}






