package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\September10AmSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ramsss");
		driver.findElement(By.id("pass")).sendKeys("1234");
		System.out.println("new joiner A");
		System.out.println("A work");
		
		
		
		
		
		
		
		
		
		
	}

}
