package com.resolver.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.resolver.qa.base.TestBase;
import com.resolver.qa.pages.Test2Page;

public class Number2Test extends TestBase {
	
	Test2Page test2Page;
	
	public Number2Test() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		test2Page = new Test2Page();
	}
	
	@Test
	public void verifyNumberOfListItemTest() {
		int list = test2Page.verifyNumberOfListItem();
		System.out.println(list);
		Assert.assertEquals(list, 3);;		
	}
	@Test
	public void verifySecondListItemValueTest() {
		String list = test2Page.verifySecondListItemValue();
		if(list.contains("List Item 2")) {
			System.out.println("Second list item's value is set to: 'List Item 2'");
		}
	
	}
	@Test
	public void verifySecondListBadgeValueTest() {
		String badge = test2Page.verifySecondListBadgeValue();
		Assert.assertEquals(badge, "6");
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
