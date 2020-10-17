package com.rameshsoft.automation.gmail.scripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public class ExamTest {
	
	boolean status = true;
	
	public void click()
	{
		try
		{
			WebElement e1 = null;
			e1.click();
			status = true;
		}
		catch(Exception e)
		{
			status = false;
		}
		finally
		{
			if (status) {
				System.out.println("Action is done");
			}
			else{
				System.out.println("Action is not completed");
			}
		}
	}
	
public static void main(String[] args) throws IOException, FrameworkException {
	
	int practiceHrs = 6;
	if (practiceHrs>=8) {
		System.out.println("Sure u vl get JOB");
	}
	else{
		FrameworkException a = new FrameworkException("PLZ PRACTICE WELL...AND AGAIN ATTEND INTERVIEWS");
		throw a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
