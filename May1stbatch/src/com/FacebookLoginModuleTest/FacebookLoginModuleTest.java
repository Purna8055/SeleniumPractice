package com.FacebookLoginModuleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginModuleTest {

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
    //Locator: id
	//Selector: email
	
	driver.findElement(By.id("email")).sendKeys("Timsy");
	/*<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
	 * Locator:id
	 * Selector:pass
	 */
	driver.findElement(By.id("pass")).sendKeys("1234567");
	/*<label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_8"><input value="Log In" aria-label="Log In"
	*data-testid="royal_login_button" type="submit" id="u_0_8"></label>
	*/
	driver.findElement(By.id("loginbutton")).click();
	driver.close();
	}

}
