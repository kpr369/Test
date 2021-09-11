package selenium_classes;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver(); //Opend Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.linkText("Contribute")),200,300).perform();
		//actions.contextClick(driver.findElement(By.linkText("About"))).perform();
		//driver.switchTo().frame(0);
		/*
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));*/
		//actions.dragAndDrop(drag, drop).perform();
		
		//actions.clickAndHold(drag).moveToElement(drop).release().perform();
		
		//actions.click(drag).perform();
		
		
	//	actions.keyDown(driver.findElement(By.name("s")), Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).perform();
		
		driver.findElement(By.name("s")).sendKeys(Keys.SHIFT+"dafa");
		screenShot();
		
		driver.findElement(By.xpath("asdfdas")).click();
	}
	
	
	public static void screenShot()
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("Z:\\screenshot"+ new SimpleDateFormat("dd-mm-yyyy-hh-MM-ss").format(new Date())+".jpeg"));
	}

}
		