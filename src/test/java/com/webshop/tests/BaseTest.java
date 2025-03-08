package com.webshop.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webshop.driver.DriverScript;
import com.webshop.pages.HomePage;
import com.webshop.pages.RegisterPage;

public class BaseTest extends DriverScript {
	
	public static ExtentTest logger;
	public static ExtentReports report;
	HomePage homePage;
	RegisterPage registerPage;
	
	@BeforeSuite
	public void setUpReport() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./testreports/autoresult.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeMethod
	public void preTest() {
		initApplication();
		homePage = new HomePage();
		registerPage = new RegisterPage();
	}
	
	@AfterMethod
	public void tearDown() {
		report.flush();
		quitDriver();
	}

}
