package roniPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		/* driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
		*/
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("qaclickacademy");
		driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("forgot")).click();
		

	}

}
