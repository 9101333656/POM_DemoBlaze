package com.DemoBlaze.TestCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Dblaze.base.testBase;
import com.DemoBlaze.pages.CartPage;
import com.DemoBlaze.pages.HomePage;
import com.DemoBlaze.pages.LoginPage;

public class cartPageTest extends testBase {

	LoginPage logInPage;
	HomePage homePage;
	CartPage cartPage;
	
	public cartPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws AWTException, InterruptedException {
		initialization();
		cartPage = new CartPage();
		logInPage = new LoginPage(); 
		homePage = logInPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void verifyCartPageTitleTest() {
		String cartPageTitle = cartPage.verifyCartPageTitle();
		Assert.assertEquals(cartPageTitle, "STORE","Home page title not matched");
		
	}
	
	@Test(priority = 2)
	public void VerifyClickOnCartTag() {
		cartPage.clickOnCartTag();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
