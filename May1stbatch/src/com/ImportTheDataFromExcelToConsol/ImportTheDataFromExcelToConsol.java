package com.ImportTheDataFromExcelToConsol;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportTheDataFromExcelToConsol {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/Input Data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(File);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        int rowcount=sheet.getLastRowNum();//To get active row.
        for(int i=0;i<=rowcount;i++)//Goes to all the active rows
        {Row R=sheet.getRow(i);
        int CellCount=R.getLastCellNum();
        for(int j=0;j<CellCount;j++)
        {
        	String C=R.getCell(j).getStringCellValue();//we can use even this- Cell C=get.Cell(j);
        	System.out.print(C+" ");                    //it accepts all kind of data type.
        }
        	System.out.println(" ");
        }
        workbook.close();
	}

}
