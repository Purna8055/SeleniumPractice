package com.ExportCountryNamesToExcelSheet;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExportCountryNamesToExcelSheet {

	public static void main(String[] args) throws IOException
	{ System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String url="http://newtours.demoaut.com";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	driver.findElementByPartialLinkText("REGI").click();
	FileInputStream File=new FileInputStream("./src/com/ExcelFiles/CountryNames.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(File);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	WebElement Country=driver.findElementByName("country");
	List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
	for(int i=0;i<CountryNames.size();i++)
	{
		String CountryName=CountryNames.get(i).getText();
		Row R=sheet.createRow(i);
		Cell C=R.createCell(0);
		C.setCellValue(CountryName);
		
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelFiles/CountryNames.xlsx");
		 workbook.write(file1);
		 
		System.out.println(CountryName);
	}
	workbook.close();
	driver.quit();	

	}

}
