package selenium_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Opend Browser
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
	}

}
