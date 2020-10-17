package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextUtilityTest {
public static void main(String[] args) throws IOException {
	
	File file = new File("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\supporters\\hello.txt");
	
	boolean b = file.createNewFile();
	if (b) {
		System.out.println("File is created");
	}
	else{
		System.out.println("Returns existing file");
	}
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	while(bufferedReader.ready())
	{
		System.out.println(bufferedReader.readLine());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//FileWriter fileWriter = new FileWriter("");
	FileWriter fileWriter = new FileWriter(file);
	//FileWriter fileWriter = new FileWriter(file, true);
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	//bufferedWriter.wri
	bufferedWriter.write("Hello");
	bufferedWriter.newLine();
	bufferedWriter.write("plz");
	bufferedWriter.newLine();
	bufferedWriter.write("practice well");
	bufferedWriter.newLine();
	bufferedWriter.write("plz practice well");
	bufferedWriter.newLine();
	bufferedWriter.write("Hello i am requesting plz do practice PLZ");
	bufferedWriter.newLine();
	bufferedWriter.flush();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
