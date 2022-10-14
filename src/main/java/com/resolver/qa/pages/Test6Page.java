package com.resolver.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.qa.base.TestBase;

public class Test6Page extends TestBase {
	
	@FindBy(id = "test-6-div")
	WebElement test6;
	
	
	public Test6Page() {
		PageFactory.initElements(driver, this);
	}
	
	 public String getCellValue(int i, int j) {
		 
		String cell = driver.findElement(By.xpath("//div[@id = 'test-6-div']/div/table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
		return cell;
	 }

}
