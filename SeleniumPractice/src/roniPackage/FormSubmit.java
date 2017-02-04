package roniPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.spicejet.com/");
       driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
       driver.findElement(By.xpath("//a[@value='GOI']")).click();
       //If you want to access methods of any class, create an object1 of 
       //that class and use object1.methodname() to use its methods
       Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
       dropdown.selectByIndex(4);
       dropdown.selectByVisibleText("9 Adults");
       dropdown.selectByValue("5");
       
       driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_studentAndDefense']")).click();
       System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_studentAndDefense']")).isSelected());
       
       
	}

}
