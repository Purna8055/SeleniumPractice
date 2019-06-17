package com.POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting extends BaseTest
{
	@Test
	public void homepage() throws InterruptedException, IOException
	{
		WelcomeMercuryTours wmt= PageFactory.initElements(driver,WelcomeMercuryTours.class);
		FileInputStream File=new FileInputStream("./src/com/ApplicationTestDataFile/NewToursLoginData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int RowCount=sheet.getLastRowNum();
		
		for(int i=1;i<RowCount;i++)
		{Row R =sheet.getRow(i);
		
		wmt.logIn(R.getCell(0).getStringCellValue(),R.getCell(1).getStringCellValue());
		System.out.println("UserName: "+R.getCell(0).getStringCellValue()+" ,Password: "+R.getCell(1).getStringCellValue());
		System.out.println(driver.getTitle());
		System.out.println();
		
		String ExpectedTitle="Find";
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.contains(ExpectedTitle))	
		{   System.out.println("Log In Is Successful");
			R.createCell(2).setCellValue("Log In Is Successful");
		}
		else
		{
			System.out.println("Failed to Log In");
			R.createCell(2).setCellValue("Failed to Log In");
		}
		FileOutputStream file1= new FileOutputStream("./src/com/ResultFiles/New Tours Login Result.xlsx");
		workbook.write(file1);
		System.out.println();
		driver.navigate().back();
		}
		//driver.navigate().back();
		
		wmt.flights();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.hotels();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.carRentals();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		Thread.sleep(10000);
		driver.navigate().back();
		
		wmt.cruises();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
        wmt.destinations();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		Thread.sleep(5000);
		driver.navigate().back();

		
		wmt.vacations();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.support();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.contact();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.signOff();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		workbook.close();
	}
	

}
