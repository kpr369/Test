package selenium_classes;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Opend Browser
		driver.get("https://www.naukri.com/");
		String focusedWindow = driver.getWindowHandle(); //1
		Set<String> allOpenWindows = driver.getWindowHandles(); //2  //1   //3
		for(String window : allOpenWindows)
		{
			
				driver.switchTo().window(window);
				if(driver.getTitle().equals("Sykes"))
					driver.close();
		
		}
			
	}

}
	