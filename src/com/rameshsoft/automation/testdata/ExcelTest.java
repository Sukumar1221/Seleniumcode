package com.rameshsoft.automation.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fip = new FileInputStream("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
	
	Workbook workbook = WorkbookFactory.create(fip);
	
	Sheet sheet1 = workbook.getSheet("java");
	
	//sheet1.getRow(0).createCell(6).setCellValue("PLZ[PRACTICE");
	Row row0 = sheet1.getRow(0);
	Cell cell07 = row0.createCell(7);
	cell07.setCellValue("PLZ PRACTICE");
	
	Row row6 = sheet1.createRow(6);
	Cell cell60 = row6.createCell(0);
	cell60.setCellValue("JAVA");
	
	Cell cell61 = row6.createCell(0);
	cell61.setCellValue("SELENIUM");
	
	FileOutputStream fop = new FileOutputStream("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
	workbook.write(fop);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*for(int i=0;i<sheet1.getLastRowNum()+1;i++)
	{
		Row row = sheet1.getRow(i);
		for(int j=0;j<row.getLastCellNum();j++)
		{
			Cell cell = row.getCell(j);
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				System.out.println(cell.getStringCellValue());
			}
			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				System.out.println(cell.getNumericCellValue());
			}
			else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
				System.out.println(cell.getBooleanCellValue());
			}
		}
	}*/
	
	//Sheet sheet1 = workbook.getSheetAt(0);
	/*Row row0 = sheet1.getRow(0);
	int rowCount = sheet1.getLastRowNum()+1;
	System.out.println("NoOf rows are: " +rowCount);
	
	Cell cell00 = row0.getCell(0);
	
	String cell00Value = cell00.getStringCellValue();
	System.out.println("cell00Value :"+cell00Value);
	
	System.out.println("NoOf cells in oth ROW:" +row0.getLastCellNum());
	
	Cell cell01 = row0.getCell(1);
	String cell01Value = cell01.getStringCellValue();
	System.out.println("cell01Value: " +cell01Value);
	
	Row row1 = sheet1.getRow(1);
	System.out.println("NoOf cells in 1st ROW:" +row1.getLastCellNum());
	Cell cell10 = row1.getCell(0);
	System.out.println("cell10Value is: " +cell10.getStringCellValue());
	
	Cell cell11 = row1.getCell(1);
	System.out.println("cell11Value is: " +cell11.getStringCellValue());
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
