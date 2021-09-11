package selenium_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		
				
		WebDriver driver = new ChromeDriver(); //Opend Browser
		driver.get("https://www.google.com/");		
		String title = driver.getTitle();
		System.out.println(driver.getPageSource());
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://facebook.com");
		Thread.sleep(3000);
		
		driver.navigate().back(); // Google
		Thread.sleep(3000);
		
		driver.navigate().forward();//Facebook
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
	
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	
	}

}
