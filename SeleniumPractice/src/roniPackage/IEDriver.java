/**
 * 
 */
package roniPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:/Users/ronim_000/Desktop/Selenium3/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
