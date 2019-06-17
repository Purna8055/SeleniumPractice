package com.BrowserAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Example {


		public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			FirefoxDriver FB=new FirefoxDriver();
			FB.get("http://www.bing.com");
			FB.navigate().to("https://www.youtube.com");
			//<div id="search-input" class="ytd-searchbox-spt" slot="search-input"><input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" tabindex="0" type="text" spellcheck="false" placeholder="Search" aria-label="Search" aria-haspopup="false" role="combobox" aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;"></div>
		    FB.findElement(By.name("search_query")).sendKeys("R15 Birthday Celebrations");
		    //<button id="search-icon-legacy" class="style-scope ytd-searchbox" aria-label="Search">
	       
		    FB.findElement(By.id("search-icon-legacy")).click();
		    
		
			
		}}
