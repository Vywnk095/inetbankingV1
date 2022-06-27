package com.inetbankg.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbankng.utilities.Readconfig;

public class Baseclass {

	Readconfig readconfig = new Readconfig();
	
	public String baseurl= readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password =readconfig.getpassword()	;
	public static WebDriver driver;

	
	@Parameters("browser")
	@BeforeClass
	public void Setup(String br) {

		if(br.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
	driver= new ChromeDriver();}
	
		else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
		driver= new FirefoxDriver();
		}

		else if(br.equals("ie")) {
		System.setProperty("webdriver.ie.driver",readconfig.getiepath());
		driver= new InternetExplorerDriver();
	}
		driver.get(baseurl);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
