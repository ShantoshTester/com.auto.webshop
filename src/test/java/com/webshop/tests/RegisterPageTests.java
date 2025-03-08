package com.webshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTests extends BaseTest {
	

	@Test(priority = 3)
	public void testExistingUserValidation()
	{
		logger = report.createTest("Test Existing User Validation");
		String homePageTitle = homePage.getHomePageTitle();
		logger.pass("getting home page title");
		System.out.println(homePageTitle);
		Assert.assertTrue(homePageTitle.contains("Demo Web Shop"));
		logger.pass("home page title validated");
		homePage.clickRegisterLink();
		logger.pass("clicked register link");
		registerPage.clickMaleRadioButton();
		logger.pass("clicked male radio button");
		registerPage.enterFirstName("ab");
		logger.pass("entered ab as first name");
		registerPage.enterLastName("cd");
		logger.pass("entered cd as last name");
		registerPage.enterEmail("ab@test.com");
		logger.pass("entered ab@test.com as email");
		registerPage.enterPassword("pass@123");
		logger.pass("entered pass@123 as password");
		registerPage.enterConfirmPassword("pass@123");
		logger.pass("entered pass@123 as confirm password");
		registerPage.clickRegisterButton();
		logger.pass("clicked register button");
		String errMessage = registerPage.getEmailExistsText();
		System.out.println(errMessage);
		Assert.assertTrue(errMessage.contains("email already exists"));
		logger.pass("verified error message for exisiting user");
	}
	
	@Test(priority = 1)
	public void testRegisterPageLanding()
	{
		logger = report.createTest("Test RegisterPage Landing");
		homePage.clickRegisterLink();
		logger.pass("clicked register link");
		String registerPageTitle = registerPage.getRegisterPageTitle();
		System.out.println(registerPageTitle);
		Assert.assertTrue(registerPageTitle.contains("Register"));
		logger.pass("validated register page title");
		boolean registerText = registerPage.isRegisterTextDisplayed();
		System.out.println(registerText);
		Assert.assertTrue(registerText);
		logger.pass("validated register text present on the page");
	}
	
	@Test(priority = 2)
	public void testRegisterForm() {
		String homePageTitle = homePage.getHomePageTitle();
		System.out.println(homePageTitle);
		homePage.clickRegisterLink();
		registerPage.clickMaleRadioButton();
		registerPage.enterFirstName("Jhon");
		registerPage.enterLastName("Doe");
		registerPage.enterEmail("jhondoe@test.com");
		registerPage.enterPassword("pass@123");
		registerPage.enterConfirmPassword("pass@123");
	}

}
