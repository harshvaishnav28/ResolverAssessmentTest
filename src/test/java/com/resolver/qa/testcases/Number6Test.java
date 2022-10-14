package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test6Page;

public class Number6Test extends TestBase {
	
	Test6Page test6Page;
	
	public Number6Test() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		test6Page = new Test6Page();
	}
	
	@Test
	 public void getCellValueTest() {
		String cellValue = test6Page.getCellValue(2, 2);
		System.out.println(cellValue);
		Assert.assertEquals(cellValue, "Ventosanzap" );
		 
	 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
