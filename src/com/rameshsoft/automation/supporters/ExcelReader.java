package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private String filePath;
	private FileInputStream fip;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellValue;
	
	
	public ExcelReader(String filePath) throws Exception
	{
		this.filePath = filePath;
		fip = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(fip);
	}
	
	public Sheet getSheetObj(String sheetName) {
		Optional<Workbook> optional = Optional.ofNullable(workbook);
		if (optional.isPresent()) 
			sheet = workbook.getSheet(sheetName);
		else
			System.out.println("WORKBOOKIS POINTING NULL");
		return sheet;
	}
	public Sheet getSheetObj(int sheetIndex) {
		Optional<Workbook> optional = Optional.ofNullable(workbook);
		if (optional.isPresent()) 
			sheet = workbook.getSheetAt(sheetIndex);
		else
			System.out.println("WORKBOOKIS POINTING NULL");
		return sheet;
	}
	
	public String getSingleCellData(String sheetName,int rowNum,int cellNum) {
		Cell cell = getSheetObj(sheetName).getRow(rowNum).getCell(cellNum);
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			cellValue = cell.getStringCellValue();
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			cellValue = cell.getNumericCellValue()+"";
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			cellValue = cell.getBooleanCellValue()+"";
		}
		return cellValue;
	}
	
	
	public List<String> getSingleRowData(String sheetName,int rowNum) {
		List<String> data = new ArrayList<String>();
		Row row = getSheetObj(sheetName).getRow(rowNum);
		for(int i=0;i<row.getLastCellNum();i++)
		{
			cell = row.getCell(i);
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				cellValue = cell.getStringCellValue();
				data.add(cellValue);
			}
			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				cellValue = cell.getNumericCellValue()+"";
				data.add(cellValue);
			}
			else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
				cellValue = cell.getBooleanCellValue()+"";
				data.add(cellValue);
			}
		}
		return data;
	}
	
	
	
	public int findWord1(String sheetName,String word) {
		int count = 0;
		sheet = getSheetObj(sheetName);
		List<String> data = new ArrayList<String>();
		
		for(int i=0;i<sheet.getLastRowNum()+1;i++)
		{
			row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell = row.getCell(j);
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					cellValue = cell.getStringCellValue();
					if (cellValue.equalsIgnoreCase(word)) {
						count++;
						System.out.println("Sheet is: "+sheetName+" row is: "+i+" cell is: " +j);
					}
					data.add(cellValue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					cellValue = cell.getNumericCellValue()+"";
					if (cellValue.equalsIgnoreCase(word)) {
						count++;
						System.out.println("Sheet is: "+sheetName+" row is: "+i+" cell is: " +j);
					}
					data.add(cellValue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					cellValue = cell.getBooleanCellValue()+"";
					if (cellValue.equalsIgnoreCase(word)) {
						count++;
						System.out.println("Sheet is: "+sheetName+" row is: "+i+" cell is: " +j);
					}
					data.add(cellValue);
				}
			}
		}
		return count;
	}
	
	/*public int findWord(String sheetName,String word) {
		int count = 0;
		List<String> totalData = getTotalSheetData(sheetName);
		for(String str : totalData)
		{
			if (str.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		 ExcelReader excelReader = new ExcelReader("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
		 String cellData1 = excelReader.getSingleCellData("java",1 , 0);
		 String cellData2 = excelReader.getSingleCellData("java",1 , 1);
		 
		 double a = Double.parseDouble(cellData1);
		 System.out.println(a);
		 System.out.println(cellData1+"    "+cellData2);
		 
		 List<String> l = excelReader.getSingleRowData("java", 1);
		 System.out.println(l);
		 
		 List<String> d =  excelReader.getTotalSheetData("java");
		 
		 System.out.println(d);
		 
		int count =  excelReader.findWord1("java", "java");
		System.out.println("Nof  occurences is: " +count);
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
*/	
}
