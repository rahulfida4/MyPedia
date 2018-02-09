package com.pedia.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pedia.qa.Pages.HomePage;
import com.pedia.qa.Pages.LoginPage;
import com.pedia.qa.base.TestBase;

public  class LoginTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPgeTitle();
		Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	@Test(priority=2)
	public void crmLogoImageTest(){
boolean flag=		loginPage.validateCRMImage();
Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}


	
		
		
	
	

}
