package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtility {
	public static boolean isValidPhNum(String phNumber)
	{
		boolean status = true;
		
		Pattern pattern = Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(phNumber);
		
		if (matcher.find()&&matcher.group().equalsIgnoreCase(phNumber)) {
			System.out.println("Valid phone number");
			status = true;
		}
		else{
			System.out.println("InValid phonenumber");
			status = false;
		}
		return status;
	}
	public static void isValidMail(String email){
		
	}
}
