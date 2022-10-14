package com.resolver.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test2Page extends TestBase {

	@FindBy(xpath = "//*[@class = 'list-group']/li[2]")
	WebElement listValue;
	
	@FindBy(xpath = "//*[@class = 'list-group']/li")
	WebElement test2Lists;
	
	@FindBy(xpath = "//*[@class = 'list-group']//li[2]/span")
	WebElement badgeValue;
	
	
	public Test2Page() {
		PageFactory.initElements(driver, this);
	}
	
	public int verifyNumberOfListItem() {
		int size = driver.findElements(By.xpath("//ul[@class = 'list-group']/li")).size();
		return size;		
	}
	
	public String verifySecondListItemValue() {
		return listValue.getText();
	}
	
	public String verifySecondListBadgeValue() {
		return badgeValue.getText();
	}
}
