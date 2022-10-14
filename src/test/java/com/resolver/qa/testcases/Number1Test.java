package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test1Page;

public class Number1Test extends TestBase {
	
	Test1Page test1Page;
	
	public Number1Test() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		test1Page = new Test1Page();		
	}
	
	@Test(priority = 1)
	public void emailFieldTest() {
		boolean flag1 =test1Page.verifyEmailField();
		Assert.assertTrue(flag1);
	}
	
	@Test (priority = 2)
	public void passwordFieldTest() {
		boolean flag2 = test1Page.verifyPasswordField();
		Assert.assertTrue(flag2);		
	}
	
	@Test(priority = 3)
	public void signInButtonTest() {
		boolean flag3 = test1Page.verifySignInButton();
		Assert.assertTrue(flag3);
	}

	@Test(priority = 4) 
	public void enterCredentialsTest() {
		
		test1Page.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
		
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
