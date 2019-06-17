package com.OrangeHRMEmployeeList_ExportToExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OrangeHRMEmployeeList_ExportToExcel {

	public static void main(String[] args) throws IOException 
	{System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	String url="https://opensource-demo.orangehrmlive.com";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("admin123").perform();
	act.sendKeys(Keys.ENTER).perform();
    
    WebElement PIM=driver.findElementById("menu_pim_viewPimModule");
    act.moveToElement(PIM).perform();
    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    
    WebElement Table=driver.findElementByXPath("/html/body/div[1]/div[3]/div[2]/div");
    List<WebElement>Rows=Table.findElements(By.tagName("tr"));
   System.out.println("The total number of rows are: "+Rows.size());

   FileInputStream File= new FileInputStream("./src/com/ExcelFiles/EmployeeList.xlsx");
   XSSFWorkbook workbook=new XSSFWorkbook(File);
   XSSFSheet sheet=workbook.getSheet("Sheet1");
   
   for(int i=0;i<Rows.size();i++)
   { List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));
      Row R=sheet.createRow(i);
     for(int j=0;j<Columns.size();j++)
     {
    	 String Column=Columns.get(j).getText();
    	 Cell C=R.createCell(j);
    	 C.setCellValue(Column);
    	 FileOutputStream File1=new FileOutputStream("./src/com/ExcelFiles/EmployeeList.xlsx");
    	 workbook.write(File1);
    	 System.out.print(Column+" ");
     }
	 System.out.println();  
   }
   workbook.close();
   driver.quit();
	}

}
