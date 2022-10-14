package com.resolver.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test5Page extends TestBase{
	
	@FindBy(id = "test-5-div")
	WebElement test5;
	
	@FindBy(xpath = "//div[@id='test-5-div']/button")
	WebElement button;
	
	@FindBy(id = "test5-alert")
	WebElement successMessage;
	
	public Test5Page() {
		PageFactory.initElements(driver, this);
	}
	public void scrollToTest5() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", test5);
	}
	
	public boolean verifyButtonPresent() {
		return button.isDisplayed();
	}
	
	public String verifySuccessMessage() {
		button.click();
		return successMessage.getText();
	}
	
	public boolean verifyButtonIsDisabled() {
		return button.isEnabled();
	}
	
	

}
