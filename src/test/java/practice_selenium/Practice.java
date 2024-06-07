package practice_selenium;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		//Explicitly wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userName']")));
		txtusername.sendKeys("testcube4");
		
		
	   
		//driver.get("http://www.deadlinkcity.com/");
//		driver.get("https://demoqa.com/login");
//		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("testcube4");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Harappa@123");
//		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
//		driver.navigate().to("https://demoqa.com/text-box");
//		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();;
//		
		//String id = driver.getWindowHandle();
//		System.out.println("Windowhandle : "+id);
		
		
//		Set<String> WindowIDs = driver.getWindowHandles();
//		List<WebElement> WindowIDsList = new ArrayList(WindowIDs); // Change Set into List
//		
//		String ParentwindowID = WindowIDsList.get(0);
//		String ChildwindowID = WindowIDsList.get(1);
//	    driver.switchTo().window(ChildwindowID);
//	    driver.findElement(By.xpath("//a[@data-nav='nav_Join']")).click();
////	    
//		driver.switchTo().window(ParentwindowID);
//	    driver.findElement(By.xpath(ParentwindowID));
//	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("topu");
	    
//		Actions act = new Actions(driver);
//		WebElement link = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		//act.moveToElement(link).perform(); //for hover
//		//act.contextClick(link).perform();
//		act.doubleClick(link).perform();
		
//		driver.findElement(By.linkText("open cart")).click();
//		List<WebElement> images = driver.findElements(By.tagName("a"));
//		System.out.println("Total no of links :"+images.size());
		
//		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
//		Select drpcountry = new Select(country);
//		drpcountry.selectByVisibleText("India");
		
//		Actions action = new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		action.dragAndDrop(source, drop).perform();
		
//		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
//		Alert popup = mywait.until(ExpectedConditions.alertIsPresent());
//		//popup.dismiss();
//		popup.accept();
		
		/*
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int broken_links = 0;
		for(WebElement linkEle : links) {
			String herfAttValue = linkEle.getAttribute("herf");
			if(herfAttValue==null || herfAttValue.isEmpty()) {
				System.out.println("herf Value is Empty....");
				continue;
			}
			URL linkurl = new URL(herfAttValue); // convert String to url format
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println(linkEle.getText()+"   "+"=========> Broken Links");
				broken_links++;
			}
			else {
				System.out.println(linkEle.getText()+"   "+"=========>NOT  Broken Links");
			}
		}
		System.out.println("Total Number of broken Links : "+broken_links);
		*/
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
