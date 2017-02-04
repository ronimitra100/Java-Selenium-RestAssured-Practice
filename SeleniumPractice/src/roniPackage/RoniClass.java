package roniPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoniClass {

	public static void main(String[] args) {
		/* To use Selenium 3.*, you need to have the following configuration:
		 * Java 1.8 & Firefox 48+
		 * To use Selenium 2.53 or lesser, you need to have the following configuration:
		 * Java 1.7 & Firefox 47-
		 */
	   
		/*To solve frequent incompatibility issues between new versions of 
		 * Firefox and Selenium , Firefox guys have implemented a class called geckodriver.. 
		 */
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		//Using FirefoxDriver class to implement and execute methods present in Webdriver interface
		WebDriver driver = new FirefoxDriver();

	}
}
