package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test5Page;

public class Number5Test extends TestBase{
	
	Test5Page test5Page;
	
	public Number5Test() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		test5Page = new Test5Page();
	}
	
	@Test(priority = 1)
	public void scrolltoTest5Test() {
		test5Page.scrollToTest5();
	}
	
	@Test(priority = 2)
	public void verifyButtonPresentTest() {
		test5Page.verifyButtonPresent();
	}
	
	@Test(priority = 3)
	public void verifySuccessMessageTest() {
		String message = test5Page.verifySuccessMessage();
		Assert.assertEquals(message,prop.getProperty("successMessage"));
	}
	
	@Test(priority = 4)
	public void verifyButtonIsDisabledTest() {
		boolean bool =test5Page.verifyButtonIsDisabled();
		Assert.assertFalse(bool);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

}
