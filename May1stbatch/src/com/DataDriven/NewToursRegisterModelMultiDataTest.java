package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewToursRegisterModelMultiDataTest extends TestBase
{@Test(priority=0)
	public void registerLinkTest()
	{
	WebElement Register=driver.findElement(By.linkText("REGISTER"));
	Register.click();
	}
@Test(priority=1)
    public void registerationTest() throws IOException
    {
	FileInputStream File=new FileInputStream("./src/com/ApplicationTestDataFile/TestDataFileNewToursRegisterModule.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(File);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int RowNumber=sheet.getLastRowNum();
	for(int i=1;i<=RowNumber;i++)
	{
		Row R=sheet.getRow(i);
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(R.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(R.getCell(1).getStringCellValue());
		
		//Type Casting
		double d=R.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(R.getCell(3).getStringCellValue());
		
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(R.getCell(4).getStringCellValue());
		
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(R.getCell(5).getStringCellValue());
		
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(R.getCell(6).getStringCellValue());
		
		double e=R.getCell(7).getNumericCellValue();
		long y=(long)e;
		String PostalCode=Long.toString(y);
		driver.findElement(By.name("postalCode")).clear();
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		
		WebElement CountryName=driver.findElement(By.name("country"));
		Select Country=new Select(CountryName);
		Country.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(R.getCell(9).getStringCellValue());
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(R.getCell(10).getStringCellValue());
		
		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys(R.getCell(11).getStringCellValue());
		

		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName=R.getCell(9).getStringCellValue();
		System.out.println("The Expected UserName is: "+ExpectedUserName);
		String ActualUserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println("The Actual Text is: "+ActualUserName);
		
		File ScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShots,new File("./NewToursAfterRegisterScreenShots/"+ExpectedUserName+".png"));
		
		if(ActualUserName.contains(ExpectedUserName))
		{
			System.out.println("The Registration is successful:PASS");
			R.createCell(12).setCellValue("The Registration is successful:PASS");
		}
		else
		{
			System.out.println("Failed to Register:FAIL");
			R.createCell(12).setCellValue("Failed to Register:FAIL");
		}
		FileOutputStream file1=new FileOutputStream("./src/com/TestResultFile/TestResultFileNewToursRegisterModule.xlsx");
		workbook.write(file1);
		
		driver.navigate().back();
		
	}
	workbook.close();
    }
	
	
	
	
}
