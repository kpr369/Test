package selenium_classes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableHandling {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
			
		driver = new ChromeDriver(options); //Opend Browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		
			click("//txtJourneyDate");
		List<WebElement> dates=	driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]//following-sibling::table//tbody//td//a"));
		
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd"));
		
		for(WebElement d: dates)
		{
			if(d.getText().equals(date))
			{
				d.click();
				break;
			}
		}
	}
	
	
	public static void click(String locator)
	{
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
	}

}
