package com.resolver.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test3Page extends TestBase {
	
	@FindBy(id = "test-3-div")
	WebElement test3;
	
	@FindBy(id = "dropdownMenuButton")
	WebElement dropDownButon;
	
	@FindBy(xpath = "//div[@aria-labelledby='dropdownMenuButton']/a[3]")
	WebElement option3Button;
	
	
	public Test3Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void scrollToTest3() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", test3);
	}
	
	public String verifyDropDownOption() {
		return dropDownButon.getText();
	}
	
	public void selectOption3() {
		dropDownButon.click();
		option3Button.click();
	}

}
