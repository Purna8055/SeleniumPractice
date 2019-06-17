package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations_InputValues {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet=workbook.getSheet("Sheet1");
		Row r=Sheet.createRow(0);
		Cell c=r.createCell(0);
		
		c.setCellValue("JESUS");
		FileOutputStream File1= new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		workbook.write(File1);
		
	String	data=c.getStringCellValue();
	System.out.println(data);
	workbook.close();
		

	}

}
