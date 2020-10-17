package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
public static void main(String[] args) {
	
	boolean a = RegExUtility.isValidPhNum("9177791456");
	if (a) {
		System.out.println("Valid ph num");
		//ele.sendKeys("9177791456")
	}
	else{
		System.out.println("InValid");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String a = "wells123fargo3";
	char[] ch = a.toCharArray();
	int sum = 0;
	
	for(char d : ch)
	{
		if (Character.isDigit(d)) {
			int i = Character.getNumericValue(d);
			sum = sum + i;
		}
	}
	
	System.out.println("SUM IS: " +sum);*/
	
	/*Pattern pattern = Pattern.compile("[0-9]");
	Matcher matcher = pattern.matcher("wells123fargo3");
	int count = 0;
	int sum = 0;
	while(matcher.find())
	{
		String a = matcher.group();
		int d = Integer.parseInt(a);
		sum = sum +d;
		
		count++;
	}
	System.out.println("NOOF OCCURENCES OF A WORD SELE IS: " +count);
	System.out.println("SUM IS: "+sum);
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
