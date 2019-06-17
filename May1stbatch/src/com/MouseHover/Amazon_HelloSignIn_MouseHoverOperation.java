package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOperation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		 String url="https://www.amazon.in";
		 driver.get(url);

		 driver.manage().window().maximize();
		 
		WebElement HelloSignIn=driver.findElementById("nav-link-yourAccount");
		//Actions class is used to automate mouse and keyboard related operations.
		
		Actions act=new Actions(driver);
		act.moveToElement(HelloSignIn).perform();
		Thread.sleep(5000);
		
		//Automating 'Your Orders Element' under helloSignIn Link
		driver.findElement(By.linkText("Your Orders")).click();
		//WebElement YourOrders=driver.findElement(By.linkText("Your Orders"));
		//System.out.println(YourOrders);
		//act.moveToElement(YourOrders);
		//act.click();
		//act.perform();
		//action.moveToElement(element).moveToElement(driver.findElement(By.linkText("iPads"))).cl
		 //act.moveToElement(HelloSignIn).moveToElement(driver.findElement(By.linkText("Your Orders"))).click();
	driver.quit();
	}
	

}
