package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {

	private String filePath;
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	
	public TextReader(String filePath) throws IOException
	{
		this.filePath = filePath;
		file = new File(filePath);
		boolean b = file.createNewFile();
		if (b) {
			System.out.println("File is created");
		}
		else{
			System.out.println("Returns existing file");
		}
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		fileWriter = new FileWriter(file);
		//FileWriter fileWriter = new FileWriter(file, true);
		bufferedWriter = new BufferedWriter(fileWriter);
		
	}
	
	
	public String getData() throws IOException
	{
		return bufferedReader.readLine();
	}
	
	
	public void writeData(int data) throws IOException {
	   bufferedWriter.write(data);
	   bufferedWriter.flush();
	}
    public void writeData(String data) throws IOException {
    	bufferedWriter.write(data);
   	    bufferedWriter.flush();
	}
	
	public void writeData(List<String> data) throws IOException
	{
		for(String data1 : data){
		bufferedWriter.write(data1);
		}
   	    bufferedWriter.flush();
	}
	
	public List<String> getTotalFileData() throws IOException{
		List<String> data = new ArrayList<String>();
		while(bufferedReader.ready())
		{
			String value = bufferedReader.readLine();
			data.add(value);
		}
		return data;
	}
}
