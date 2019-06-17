package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_NewTours 
{

	public static void main(String[] args) throws IOException 
	{System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String url="http://newtours.demoaut.com";
	driver.get(url);
	
	
	List<WebElement>LinkNames=driver.findElementsByTagName("a");
	int LinkCnt=LinkNames.size();
	System.out.println("The total number of links present in New Tours home page are: "+LinkCnt);
	
	for(int i=0;i<LinkCnt;i++)
	{String LinkName=LinkNames.get(i).getText();
	System.out.println("The link name is: " +LinkName);
	LinkNames.get(i).click();
	
	//Taking Screenshots of linked pages
	File ScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShots,new File("./ScreenShots/"+LinkName+".png"));
	
	driver.navigate().back();
	LinkNames=driver.findElementsByTagName("a");	
	}
		
driver.quit();
	}

}
