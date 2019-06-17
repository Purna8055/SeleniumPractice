package com.OrangeHRM

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest 
{Logger logger = Logger.getLogger(LogInTest.class);
WebDriver driver = null;
String url ="https://opensource-demo.orangehrmlive.com";

@BeforeTest
public void setUp()
{
PropertyConfigurator.configure("log4j.properties");	
driver = new FirefoxDriver();
logger.info("Firefoxbrowser Launche Successfully");
}
@Test
public void login()
{
driver.get(url)	
}

}
