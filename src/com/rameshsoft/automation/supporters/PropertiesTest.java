package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fip = new FileInputStream("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\objectrepository\\OR_Gmial.properties"); 
		
		Properties properties = new Properties();
		properties.load(fip);
		
		Set keys = properties.keySet();
		for(Object obj : keys)
		{
			String key = (String) obj;
			
			String val = properties.getProperty(key);
			System.out.println(key+"......"+val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String val1 = properties.getProperty("gmail_un_id12","hello");
		String val2 = properties.getProperty("gmail_un_xpath","java");
		String val3 = properties.getProperty("gmail_un_css12","plz practice");
		String val4 = properties.getProperty("gmail_pwd_name","easy");
		String val5 = properties.getProperty("gmail_signin_id","practice programs from my youtube channel");
		*/
		
		
		/*System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		System.out.println(val4);
		System.out.println(val5);
		
		
		properties.setProperty("PRACTICE", "JOB");
		
		
		FileOutputStream fop = new FileOutputStream("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\objectrepository\\OR_Gmial.properties");
		properties.store(fop, "file is saved succesfully");
		*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
