package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.LoginDemoQa;
import testBase.BaseClass;

public class TC_LoginDemoQa extends BaseClass {
	LoginDemoQa ldg;
	
	public TC_LoginDemoQa () {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		ldg = new LoginDemoQa();
	}
	
	@Test
	void login() throws InterruptedException {
		ldg.setUserName().sendKeys(prop.getProperty("userName"));
		ldg.setPassword().sendKeys(prop.getProperty("password"));
	    ldg.clkLogin().click();
	    Thread.sleep(5000);
	    boolean b = ldg.clkLogout().isDisplayed();
	    System.out.println("Successful Login : "+ b);
	}
	
	@AfterClass
	void Close()
	{
		driver.close();
	}
	

}
