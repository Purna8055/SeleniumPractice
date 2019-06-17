package com.Frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		String url="https://jqueryui.com/droppable/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement Draggable=driver.findElement(By.id("draggable"));
		WebElement Droppable=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Draggable, Droppable);
		act.perform();
		driver.switchTo().defaultContent(); driver.quit();
	}

}
