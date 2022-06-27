package com.inetbankg.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends Baseclass{

	@Test
	public void logintest() throws IOException {
			
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.ClickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
		}
		else 
		{
		//	capturescreen(driver,"logintest");//
			Assert.assertTrue(false);
		}
}
	}
