package com.DemoBlaze.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dblaze.base.testBase;

public class LoginPage extends testBase {
	
	@FindBy(css = "a.nav-link#login2")
	WebElement logInTag;
	
	@FindBy(css = "input.form-control#loginusername")
	WebElement username;
	
	@FindBy(css = "input.form-control#loginpassword")
	WebElement password;
	
	@FindBy(css = "button[onclick='logIn()'].btn.btn-primary")
	WebElement logInButton;
	
	@FindBy(xpath = "(//button[text()='Close'])[3]")
	WebElement logInCloseButton;
	
	@FindBy(css = "a#signin2")
	WebElement signUpTag;
	
	@FindBy(css = "input#sign-username")
	WebElement SignUpUsername;
	
	@FindBy(css = "input#sign-password")
	WebElement SignUpPassword;
	
	@FindBy(css = "button[onclick='register()']")
	WebElement SignUpButton;
	
	public LoginPage() {//Constructor
		PageFactory.initElements(driver, this);
		
	}
	public String validateLogInPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage logIn(String user, String passw) throws AWTException, InterruptedException {
		logInTag.click();
		username.sendKeys("ridip");
		password.sendKeys("rid@123");
		logInButton.click();
		Robot rbt = new Robot();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		logInCloseButton.click();
		
		return new HomePage();
	}

}
