package selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Opend Browser
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu']//a"));
		
		for(WebElement ele : driver.findElements(By.xpath("//div[@class='menu']//a")))
		{
			System.out.println(ele.getText());

			if(ele.getText().contains("Link Ticket"))
			{
				System.out.println(ele.getText());
				((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
				break;
			}
		}
	}
}
