package com.LoginAndAddingOfEmployee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_LoginAndAddingOfEmployee {

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElementById("txtPassword").sendKeys("admin123");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	
	String Expectedurl=driver.findElementByLinkText("Dashboard").getAttribute("href");
	String Actualurl= driver.getCurrentUrl();
	if(Actualurl.equals(Expectedurl))
	{System.out.println("Logged in successfully and navigated to the Dashboard page-PASS");}
	else{System.out.println("Logged in successfully but navigated to other page-FAIL");}

	WebElement PIM=driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPimModule']"));
	act.moveToElement(PIM).perform();
 
    String Expected_url=driver.findElement(By.linkText("Add Employee")).getAttribute("href");
    //driver.get(Expected_url);We can use even this to navigate to the add employee 
    //page but since we are validating the page better to go with the below opt.
    driver.findElement(By.xpath("//a[@href='/index.php/pim/addEmployee']")).click();
   String Actual_url=driver.getCurrentUrl();
   if(Actual_url.equals(Expected_url))
   {
	   System.out.println("Successfully navigated to add employee page-PASS");
   }
   else{System.out.println("Failed to navigate to the Add Employee page-FAIL");}
   
    driver.findElementById("firstName").sendKeys("Pranith");
    driver.findElementByXPath("//*[@id='middleName']").sendKeys("Kumar");
    driver.findElementByName("lastName").sendKeys("Behera");
    
    /*for browse btn.
     * <input class="duplexBox" type="file" name="photofile" id="photofile">
    WebElement Browse=driver.findElementById("photofile");
     Actions act2=new Actions(driver);
    act2.moveToElement(Browse).click().perform();   
     */
    
    //<input type="checkbox" name="chkLogin" value="1" id="chkLogin">
  WebElement ClickBox =driver.findElementById("chkLogin");
  //Actions act3=new Actions(driver);
  act.moveToElement(ClickBox).click().perform();
  act.sendKeys(Keys.TAB).sendKeys("Pranith").perform();
  act.sendKeys(Keys.TAB).sendKeys("Mechanical*1").perform();
  act.sendKeys(Keys.TAB).sendKeys("Mechanical*1").perform();
  
   WebElement Status=driver.findElementById("status");
  List<WebElement> Func=Status.findElements(By.tagName("option"));
  Func.get(0).click();
  driver.findElementById("btnSave");//click operation can't be performed because the data is already saved.
  driver.quit();
	}

}
