package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public  LoginPage (WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;

public void setusername(String uname) {
	txtUserName.sendKeys(uname);
}

public void setpassword(String pwd) {
	txtPassword.sendKeys(pwd);
}

public void ClickSubmit() {
	btnLogin.click();
}




}
