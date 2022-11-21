package com.DemoBlaze.TestCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Dblaze.base.testBase;
import com.DemoBlaze.pages.HomePage;
import com.DemoBlaze.pages.LoginPage;

public class logInPageTest extends testBase{
	
	LoginPage logInPage;
	HomePage homePage;
	
	public logInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		logInPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void logInPageTitleTest() {
		String title = logInPage.validateLogInPageTitle();
		Assert.assertEquals(title, "STORE");
	}
	
	@Test(priority =2)
	public void logInTest() throws AWTException, InterruptedException {
		homePage = logInPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
