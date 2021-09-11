package java_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Open Browser
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle().toUpperCase());
		
		System.out.println(driver.getCurrentUrl());
			
	}
	
}
