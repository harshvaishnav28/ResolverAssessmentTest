package com.resolver.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test1Page extends TestBase {
	
	@FindBy(id = "inputEmail")
	WebElement email;
	
	@FindBy(id = "inputPassword")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(), 'Sign in')]")
	WebElement signIn;
	
	public Test1Page() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyEmailField() { 
		return 	email.isDisplayed();
	}
	
	public boolean verifyPasswordField() { 
		return 	password.isDisplayed();
	}
	
	public boolean verifySignInButton() { 
		return 	signIn.isDisplayed();
	}
	
	public void enterCredentials(String un, String pw) {	
		email.sendKeys(un);
		password.sendKeys(pw);
		signIn.click();		
	}
	

}
