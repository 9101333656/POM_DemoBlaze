package com.DemoBlaze.TestCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Dblaze.base.testBase;
import com.DemoBlaze.pages.HomePage;
import com.DemoBlaze.pages.LoginPage;


public class homePageTest extends testBase {

	LoginPage logInPage;
	HomePage homePage;
	
	
	public homePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws AWTException, InterruptedException {
		initialization();
		logInPage = new LoginPage(); 
		homePage = logInPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "STORE","Home page title not matched");
		
	}
	
	@Test(priority = 2)
	public void verifyPhonesPageTest() throws InterruptedException {
		homePage = homePage.clickOnPhonesTag();
	}
	
	@Test(priority = 3)
	public void VerifyClickOnProduct() throws InterruptedException, AWTException {
		homePage.clickOnIPhone6Tag();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
