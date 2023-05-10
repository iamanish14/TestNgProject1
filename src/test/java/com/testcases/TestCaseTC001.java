package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.AddToCart;
import com.pageobjects.Bagpage;
import com.pageobjects.Baseclass;
import com.pageobjects.Loginpage;

public class TestCaseTC001 extends Baseclass {
	@Test
	public void logintest() {

		Loginpage lp = new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();

	}

	@Test(dependsOnMethods = { "logintest" })
	public void addtocart() {
		AddToCart ac = new AddToCart(driver);
		ac.luclick();
		ac.tshirtclick();
		ac.tsirtsize();
		ac.addtocart();

	}

	@Test(dependsOnMethods = {"logintest"})
	public void bagpage()  {
		Bagpage bp = new Bagpage(driver);
		bp.gears();
		bp.bagss();
//		bp.dropdownss();
		bp.mousehovere();
		bp.adding();

	}
}
