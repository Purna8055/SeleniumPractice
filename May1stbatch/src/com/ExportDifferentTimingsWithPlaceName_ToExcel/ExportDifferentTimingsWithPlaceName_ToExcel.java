package com.ExportDifferentTimingsWithPlaceName_ToExcel;

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
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExportDifferentTimingsWithPlaceName_ToExcel {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.timeanddate.com/worldclock/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    FileInputStream File=new FileInputStream("./src/com/ExcelFiles/TimeAndDateExportExcel.xlsx");
	    XSSFWorkbook workbook=new XSSFWorkbook(File);
	    XSSFSheet sheet= workbook.getSheet("Sheet1");
	    
	
	    WebElement Table=driver.findElementByXPath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]");
	    List<WebElement>Rows=Table.findElements(By.tagName("tr"));
	    System.out.println(Rows.size());
	
        for(int i=0;i<Rows.size();i++)
        {    Row R=sheet.createRow(i);
        	List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));
        	for(int j=0;j<Columns.size();j++)
        	
        	{
        		String data=Columns.get(j).getText();
        		//Row	R=sheet.createRow(i);
        		Cell C=R.createCell(j);
            	C.setCellValue(data);
            	FileOutputStream file1=new FileOutputStream("./src/com/ExcelFiles/TimeAndDateExportExcel.xlsx");
            	workbook.write(file1);
            	
        		System.out.print(data+" ");
        	
        	
        	}
        	System.out.println();
        }
        workbook.close();
	   driver.quit(); 
	}

}
