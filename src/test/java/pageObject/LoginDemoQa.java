package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class LoginDemoQa extends BaseClass {
	
	//Element
	
	@FindBy(xpath="//input[@placeholder='UserName']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement btnlogin;
	
	@FindBy(xpath="//div[@class='text-right col-md-5 col-sm-12']//button[@type='button']")
	WebElement btnLogout;
	
	//Action
	
	public WebElement setUserName() {
		return txtUserName;
	}
	
	public WebElement setPassword() {
		return txtPassword;
	}
	
	public WebElement clkLogin() {
		return btnlogin;
	}
	
	public WebElement clkLogout() {
		return btnLogout;
	}

}
