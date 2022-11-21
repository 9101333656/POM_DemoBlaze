package com.DemoBlaze.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dblaze.base.testBase;

public class CartPage extends testBase{
	
	@FindBy(css = "[id='cartur']")
	WebElement CartTag;
	
	@FindBy(css = ".btn.btn-success")
	WebElement placeOrderButton;
	
	@FindBy(css = "input.form-control#name")
	WebElement nameField;
	
	@FindBy(css = "input.form-control#country")
	WebElement countryField;
	
	@FindBy(css = "input.form-control#city")
	WebElement cityField;
	
	@FindBy(css = "input.form-control#card")
	WebElement craditCardField;
	
	@FindBy(css = "input.form-control#month")
	WebElement monthField;
	
	@FindBy(css = "input.form-control#year")
	WebElement yearField;
	
	@FindBy(css = "button.btn.btn-primary[onclick='purchaseOrder()']")
	WebElement purchaseButton;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCartPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnCartTag()  {
		CartTag.click(); 
		placeOrderButton.click();
		nameField.sendKeys("ridip");
		countryField.sendKeys("India");
		cityField.sendKeys("Delhi");
		craditCardField.sendKeys("65297265341");
		monthField.sendKeys("November");
		yearField.sendKeys("2022");
		purchaseButton.click();
		
		
	}

}
