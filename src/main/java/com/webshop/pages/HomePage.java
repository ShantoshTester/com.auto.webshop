package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.webshop.driver.DriverScript;

public class HomePage extends DriverScript {
	
//*********************************** Page Elements ************************************************//	
	
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(xpath = "//a[text()='Log in']") private WebElement loginLink;
	
//*********************************** Page Initialization ******************************************//
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
//*********************************** Page Actions/Methods ******************************************//
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}

}
