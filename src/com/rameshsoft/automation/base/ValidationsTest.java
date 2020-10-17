package com.rameshsoft.automation.base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.rameshsoft.automation.pageobjects.Gmail_Home_Page;

public class ValidationsTest{

	@Test
	public void loignTest() {
		String actTitle = "Gmail";
		String expTitle = "Gmail1";
		SoftAssert soft = new SoftAssert();
		System.out.println("1");
		soft.assertEquals(expTitle, actTitle);
		System.out.println("2");
		System.out.println("3");
	}			
}







