package com.resolver.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test4Page extends TestBase {
	
	@FindBy(id = "test-4-div")
	WebElement test4;
	
	@FindBy(xpath = "//div[@id='test-4-div']/button[1]")
	WebElement button1;
	
	@FindBy(xpath = "//div[@id='test-4-div']/button[2]")
	WebElement button2;
	
	public Test4Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void scrollToTest4() { 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", test4);
	}
	
	public boolean verifyButton1() {
		return button1.isEnabled();
	}
	
	public boolean verifyButton2() {
		return button2.isEnabled();
	}
		
}
