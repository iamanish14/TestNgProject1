package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends Baseclass {
	public AddToCart(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@aria-label='store logo']//img")
	WebElement lumaclick;
	@FindBy(xpath = "//img[@alt='Argus All-Weather Tank']")
	WebElement tshirt;
	@FindBy(xpath = "//div[@id='option-label-size-143-item-170']")
	WebElement tshirtsize;
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	WebElement addtocart;

	public void luclick() {
		lumaclick.click();
	}

	public void tshirtclick() {
		tshirt.click();
	}

	public void tsirtsize() {
		tshirtsize.click();
	}

	public void addtocart() {
		addtocart.click();
	}

}
