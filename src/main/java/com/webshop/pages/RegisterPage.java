package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.webshop.driver.DriverScript;

public class RegisterPage extends DriverScript {

//*********************************** Page Elements ************************************************//	

	@FindBy(xpath = "//h1[text()='Register']") private WebElement registerText;
	@FindBy(id = "gender-male") private WebElement maleGenderRadioBox;
	@FindBy(xpath = "//input[@id='FirstName']") private WebElement firstNameTextBox;
	@FindBy(xpath = "//input[@id='LastName']") private WebElement lastNameTextBox;
	@FindBy(xpath = "//input[@id='Email']") private WebElement emailTextBox;
	@FindBy(id = "Password") private WebElement passwordTextBox;
	@FindBy(xpath = "//input[@id='ConfirmPassword']") private WebElement confirmPasswordTextBox;
	@FindBy(id = "register-button") private WebElement registerButton;
	@FindBy(xpath = "//li[text()='The specified email already exists']") private WebElement errorEmailAlreadyExists;

//*********************************** Page Initialization ******************************************//

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

//*********************************** Page Actions/Methods ******************************************//
	
	public String getEmailExistsText() {
		return errorEmailAlreadyExists.getText();
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}

	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isRegisterTextDisplayed() {
		return registerText.isDisplayed();
	}

	public void clickMaleRadioButton() {
		maleGenderRadioBox.click();
	}

	public void enterFirstName(String firstName) {
		firstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordTextBox.sendKeys(confirmPassword);
	}

}






