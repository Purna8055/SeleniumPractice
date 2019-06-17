package com.LinkTest;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinkTesting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="https://tsrtconline.in/oprs-web/";
		driver.get(url);
		
		WebElement Header=driver.findElement(By.className("menu-wrap"));
		List<WebElement>Header_Links=Header.findElements(By.tagName("a"));
		int Header_LinksCnt=Header_Links.size();
		System.out.println("The total number of links on the header are: "+Header_LinksCnt);
		
		for(int i=0;i<Header_LinksCnt;i++)
		{
		String HeaderLinkName =Header_Links.get(i).getText();
		System.out.println("The Header Link Name is: "+HeaderLinkName);
		}
		System.out.println(" ");
		for(int i=0;i<Header_LinksCnt;i++)
		{if(i==3)
		 { //driver.switchTo().alert().dismiss();
		   //Alert alt=driver.switchTo().alert();
		   //alt.dismiss();
		continue;
		//WebElement Close =driver.findElement(By.className("init-close"));
		//Close.click();
		//driver.findElement(By.className("selectedtabcopy")).click();
		//Header=driver.findElement(By.className("menu-wrap"));
	       //Header_Links=Header.findElements(By.tagName("a"));
	       
			//driver.findElementByLinkText("X").click();
		//<span onclick="document.getElementById('InitDiv').style.display='none'" class="init-close" title="Close">X</span>	
		 }	
				
		String HeaderLinkName =Header_Links.get(i).getText();		
		Header_Links.get(i).click();
		System.out.println(HeaderLinkName+" "+"Tested Successfully");
		
		driver.findElement(By.className("selectedtabcopy")).click();
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//Home</a>
        //driver.navigate().back();
       Header=driver.findElement(By.className("menu-wrap"));
       Header_Links=Header.findElements(By.tagName("a"));
		
		}
		
		driver.quit();
	}
	
}