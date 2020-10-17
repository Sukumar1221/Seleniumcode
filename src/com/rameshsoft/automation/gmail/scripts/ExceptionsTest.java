package com.rameshsoft.automation.gmail.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsTest {
public static void main(String[] args) {
	int a = 98;
	System.out.println("1");
	System.out.println("2");
	try{
		FileInputStream fip = new FileInputStream("E:\\1MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\gmail\\scripts\\Hello.txt");
	}
	catch(FileNotFoundException e){
		System.out.println("Catch block");
		System.out.println(e.toString());
	}
	catch(Exception e){
		System.out.println("Catch block");
		//e.printStackTrace();
		//System.out.println(e.getMessage());
		System.out.println(e.toString());
	}
	
	System.out.println("3");
	System.out.println("4");
}
}



