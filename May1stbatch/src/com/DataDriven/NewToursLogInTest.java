package com.DataDriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewToursLogInTest extends TestBase {
@Test
public void logIn() throws IOException
{FileInputStream File=new FileInputStream("./src/com/ApplicationTestDataFile/NewToursLoginData.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(File);
XSSFSheet sheet=workbook.getSheet("Sheet1");

int RowNumber=sheet.getLastRowNum();
for(int i=1;i<RowNumber;i++)
{Row R=sheet.getRow(i);
driver.findElement(By.name("userName")).clear();
driver.findElement(By.name("userName")).sendKeys(R.getCell(0).getStringCellValue());
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys(R.getCell(1).getStringCellValue());
driver.findElement(By.name("login")).click();

String Expected_Title="Find";
System.out.println("The Expected Title of the page after successfull logIn is: "+Expected_Title);
String Actual_Title=driver.getTitle();
System.out.println("The Actual Title of the page after logIn is: "+Actual_Title);

if(Actual_Title.contains(Expected_Title))
{
	System.out.println("Log In is successful: PASS");
	R.createCell(2).setCellValue("Log In is successful: PASS");
}
else
{
System.out.println("Log In is Failed: FAIL");
R.createCell(2).setCellValue("Log In is Failed: FAIL");
}
FileOutputStream file1=new FileOutputStream("./src/com/TestResultFile/TestResultFileNewToursLogIn.xlsx");
workbook.write(file1);

driver.navigate().back();
driver.navigate().refresh();


}
workbook.close();
}

}
