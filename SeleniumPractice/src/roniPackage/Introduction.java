package roniPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		/* Creating an object of Firefox Driver and assigning 
		 * it to Webdriver Interface
		 */
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//(1)Navigating to some URL
		driver.get("http://qaclickacademy.com");
		//(2)Know title of a webpage
		System.out.println("Page Title: " + driver.getTitle());
		//(3) Print Page Source
		System.out.println("Page Source: " + driver.getPageSource());
		//(4) Verify that application is not routing to some other website
		System.out.println("Current URL: " + driver.getCurrentUrl());
		//Close the browser
		driver.close();
	}

}
