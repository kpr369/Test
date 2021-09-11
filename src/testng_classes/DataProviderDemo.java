package testng_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider= "dataSender")
	public void googleTest(String query) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver(); // Opend Browser
		driver.manage().window().maximize();
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys(query);
	}
	
	
	@DataProvider
	public Object[] dataSender()
	{
		
		Object[] object = new Object[] {"Java","Selenium","Python"};
		return object;
	}

	@DataProvider
	public void dataSender1()
	{
		
	}
	
}
