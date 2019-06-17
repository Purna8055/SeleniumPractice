package com.TimeAndDate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeAndDate_CaptureEntireDynamicData {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		String url="https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1] Xpath of the table
	WebElement	Table=driver.findElementByXPath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]");
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	List<WebElement>Rows=Table.findElements(By.tagName("tr"));
		for(int i=0;i<Rows.size();i++)
		{
			 List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));
			 for(int j=0;j<Columns.size();j++)//goes to every column of the row
			 {
				String data=Columns.get(j).getText();
			System.out.print(data+" "); 
			 
			 }
			System.out.println(); 
		}
driver.quit();
	}

}
