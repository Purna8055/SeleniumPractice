package com.KeywordDriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewToursLogInTest extends BaseTest {

	@Test
	public void login() throws IOException
	{
	 FileInputStream File = new FileInputStream("./src/com/ApplicationTestDataFile/NewToursLoginData.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook(File);
	 XSSFSheet sheet = workbook.getSheet("Sheet1");
	 int RowCount=sheet.getLastRowNum();
	 System.out.println(RowCount);
	 for(int i=1;i<RowCount;i++)
	 {
	 Row R=sheet.getRow(i); 
	 FileInputStream File1 = new FileInputStream("./NewToursLoginElementsProperties.properties");
	 Properties pr = new Properties();
	 pr.load(File1);
	 driver.findElement(By.name(pr.getProperty("UserName"))).clear();
	 driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(R.getCell(0).getStringCellValue());
	 
	 driver.findElement(By.name(pr.getProperty("Password"))).clear();
	 driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(R.getCell(1).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("SignIn"))).click();
	 
	 String Expected_Title="Find";
	 System.out.println("The Expected_Title of the page is: "+Expected_Title);
	
	 String Actual_Title=driver.getTitle();
	 System.out.println("The Actual Title of the page is: "+Actual_Title);
	 
	 if(Actual_Title.contains(Expected_Title))
	 {
		 System.out.println("The Log In is Successfull:PASS");
		 R.createCell(2).setCellValue("The Log In is Successfull:PASS");
	 }
	 else
	 {
		 System.out.println("Failed to Log In: FAIL");
		 R.createCell(2).setCellValue("Failed to Log In: FAIL");
	 }
	 FileOutputStream File2 = new FileOutputStream("./src/com/TestResultFile/NewToursHybridTestResult.xlsx");
	 workbook.write(File2);
	 driver.navigate().back();
	 driver.navigate().refresh();
	 }
	workbook.close();
	}
	
	
	
	
}
