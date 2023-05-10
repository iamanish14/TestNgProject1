package com.pageobjects;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utils.ReadConfig;

public class Baseclass {
	ReadConfig read = new ReadConfig();
	public String baseurl = "https://magento.softwaretestingboard.com/customer/account/login";
	public String username = read.getusername();
	public String password = read.getpassword();
	public static WebDriver driver;

	
	@BeforeClass
	public void setup() {
		 {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\InternetBanking\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		driver.get(baseurl);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
