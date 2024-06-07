package practice_selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*
		//Capture full page screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\selnium workspace\\.metadata\\Demo_qa\\screenshot\\fullpage.png");
		FileUtils.copyFile(src, trg);
		*/
		
		//Capture Screenshot of specific webelement
		WebElement tab = driver.findElement(By.xpath("//div[@id='Wikipedia1']"));
		File src=tab.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\selnium workspace\\.metadata\\Demo_qa\\screenshot\\tab.png");
		FileUtils.copyFile(src, trg);
		
		

	}

}
