package com.KeyBoardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FBLogInUsingXPath_KeyBoardOperations {

	public static void main(String[] args) 
	{ System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	String url="http://facebook.com";
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
	driver.findElementByXPath("//input[@data-testid='royal_email']").sendKeys("srini");
	//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
	driver.findElementByXPath("//*[@class='inputtext' and @data-testid='royal_pass']").sendKeys("Hello");
	
	
	Actions act = new Actions(driver);
	//act.sendKeys(Keys.TAB).perform();
	//act.sendKeys("Helli").perform();
	act.sendKeys(Keys.ENTER).perform();
		

	}

}
