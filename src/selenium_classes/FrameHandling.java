package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //Opend Browser
	driver.get("https://jqueryui.com/selectable/");
	
	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	driver.findElement(By.xpath("//li[text()='Item 4']")).click();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Button")).click();
	
	}

}
	