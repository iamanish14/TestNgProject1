package com.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bagpage extends Baseclass {
	public Bagpage(WebDriver xdriver) {

		this.driver = xdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='ui-id-6']")
	WebElement gear;
	@FindBy(xpath = "//span[text()='Bags']")
	WebElement bags;
//	@FindBy(xpath = "(//select[@id='sorter'])[1]")
//	WebElement baggy;
	@FindBy(xpath = "(//select[@id='sorter'])[1]")
	Select selecting;
	@FindBy(xpath = "(//select[@id='sorter'])[1]")
	WebElement sel;
	@FindBy(xpath = "(//li[@class='item product product-item'])[3]")
	WebElement mousehover;
	@FindBy(xpath = "(//button[@type='submit'])[4]")
	WebElement addtocart;

	public void gears() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions ref = new Actions(driver);
		ref.moveToElement(gear).perform();
	}

	public void bagss() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		bags.click();
	}

//	public void dropdownss() {
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		sel.click();
//		Select sr = selecting;
//		sr.selectByVisibleText("Product Name");
//
//	}

	public void mousehovere() {
		mousehover.click();
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();
	}

	public void adding() {
		addtocart.click();
	}

}
