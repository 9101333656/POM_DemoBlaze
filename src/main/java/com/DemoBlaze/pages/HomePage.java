package com.DemoBlaze.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dblaze.base.testBase;

public class HomePage extends testBase {

	@FindBy(css = "[id='itemc']:nth-child(2)")
	WebElement phonesTag; 
	
	@FindBy(css = "[id='itemc']:nth-child(3)")
	WebElement laptopsTag;
	
	@FindBy(css = "[id='itemc']:nth-child(4)")
	WebElement monitorsTag;
	
	
	@FindBy(css = "[id='cartur']")
	WebElement cartTag;
	
	@FindBy(css = "a.hrefch[href='prod.html?idp_=5'")
	WebElement IPhone6Product;
	
	@FindBy(css = "a.btn.btn-success.btn-lg")
	WebElement addToCartButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public HomePage clickOnPhonesTag() throws InterruptedException {
		Thread.sleep(1000);
		phonesTag.click(); 
		return new HomePage();
	}
	
	public HomePage clickOnLaptopsTag() {
		laptopsTag.click(); 
		return new HomePage();
}
	
	public HomePage clickOnMonitorsTag() {
		monitorsTag.click(); 
		return new HomePage();
}
	public CartPage clickOnCartTag() {
		cartTag.click(); 
		return new CartPage();
	
}
	public CartPage clickOnIPhone6Tag() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		IPhone6Product.click(); 
		addToCartButton.click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		return new CartPage();
}
}
