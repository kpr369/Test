package testng_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class ParllelExecution {
	
	@Test
	public void googleTest() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver(); // Opend Browser
		driver.manage().window().maximize();
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Selenium");
	}
	
	
	@Test
	public void googleTest1() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver(); // Opend Browser
		driver.manage().window().maximize();
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Java");
	}
	
	
	@Test
	public void googleTest2() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver(); // Opend Browser
		driver.manage().window().maximize();
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Python");
		
		
	}
	

}
