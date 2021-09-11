package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Opend Browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		WebElement loginHeading = driver.findElement(By.id("logInPanelHeading"));
	
		userName.clear();
		userName.sendKeys("adfsadf");
		System.out.println(loginbutton.getAttribute("value"));
		System.out.println(loginbutton.getCssValue("font-size"));
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println(loginHeading.getText());
		System.out.println(loginHeading.getTagName());
		/*driver.findElement(By.name("txtPassword")).sendKeys("Hello@");
		driver.findElement(By.partialLinkText("password?")).click();*/
		driver.findElement(By.id("txtUsername"));
		
		}
	}

