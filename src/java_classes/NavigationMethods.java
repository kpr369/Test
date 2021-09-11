package java_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Selenium Softwares\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();//Google PAge
		Thread.sleep(3000);
		driver.navigate().forward();//Facebook
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("txtUsername"));	
	}

}


