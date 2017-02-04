package roniPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) {
		/*
		 * xpath syntax = //tagname[@attribute='value']
		 * or
		 * = //*tagname[@attribute='value']
		 * css syntax = tagname[attribute='value']
		 * css syntax in case of id=#id
		 * css syntax in case of classname=.classname
		 */
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("xyz");
		driver.findElement(By.cssSelector("input[id='password']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login"));
		driver.findElement(By.cssSelector(".button.r4.wide.primary"));
	  
		/*
		 * 1) Verify in Firebug before u run the script.
		 * 2) Css customized xpath
		 * 3) #idname, .classname
		 * 4) Find the unique atrribute
		 */
		

	}

}
