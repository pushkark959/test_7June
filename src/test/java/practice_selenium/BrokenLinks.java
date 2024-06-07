package practice_selenium;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
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
		
		Thread.sleep(5000);
		driver.quit();

	}

}
