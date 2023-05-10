package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(xdriver, this);
	}

	@FindBy(xpath = "//input[@name='login[username]']")
	@CacheLookup
	WebElement txtusername;
	@FindBy(xpath = "//input[@name='login[password]']")
	@CacheLookup
	WebElement txtpassword;
	@FindBy(xpath = "(//button[@name='send'])[1]")
	@CacheLookup
	WebElement loginbtn;

	public void setusername(String uname) {
		txtusername.sendKeys(uname);

	}

	public void setpassword(String passname) {
		txtpassword.sendKeys(passname);

	}

	public void clicksubmit() {
		loginbtn.click();
	}
}
