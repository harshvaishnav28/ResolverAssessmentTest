package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test3Page;

public class Number3Test extends TestBase{
	
	Test3Page test3Page;
	
	public Number3Test() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		test3Page = new Test3Page();
	}
	
	@Test(priority = 1)
	public void scrolltoTest3Test() {
		test3Page.scrollToTest3();
	}
	
	@Test(priority = 2)
	public void verifyDropDownOptionTest() {
		String option = test3Page.verifyDropDownOption();
		Assert.assertEquals(option, "Option 1");
	}
	@Test(priority = 3)
	public void selectOption3Test() {
		test3Page.selectOption3();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
