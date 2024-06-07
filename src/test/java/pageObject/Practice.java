package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	

    public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://thriversity.harappa.education/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pushkar.kumar@harappa.education");
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("harappa123");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	

	}

	

}
