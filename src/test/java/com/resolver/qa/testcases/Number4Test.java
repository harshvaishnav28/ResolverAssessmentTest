package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test4Page;

public class Number4Test extends TestBase {
	
	Test4Page test4Page;
	
	public Number4Test() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		test4Page = new Test4Page();
	}
	
	@Test(priority = 1)
	public void scrolltoTest4Test() {
		test4Page.scrollToTest4();
	}
	@Test
	public void verifyButton1Test() {
		boolean button1 = test4Page.verifyButton1();
		Assert.assertTrue(button1);
		
	}
	@Test
	public void verifyButton2Test() {
		boolean button2 = test4Page.verifyButton2();
		Assert.assertFalse(button2);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	

}
