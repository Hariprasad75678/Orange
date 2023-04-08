package com.orange.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.utils.BaseClass;
import com.orange.utils.WaitUtilities;

public class AdminPage extends BaseClass {
	public AdminPage() {
	PageFactory.initElements(driver, this);
}

	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminLink;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addButton;
	
	@FindBy(xpath="//label[text()='User Role']/following::div[1]")
	WebElement userRoleDrop;
	
	@FindBy(xpath="//div[@role='listbox']")
	WebElement listItemsbox;
	
	@FindBy(xpath="//label[text()='User Role']/following::div[1]")
	WebElement statusDrop;
	
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement passwordText;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement confPassword;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
	@FindBy(xpath="//button[text()=' Search ']")
	WebElement searchButton;
	
	@FindBy(xpath="//label[text()='Employee Name']/following::input[1]")
	WebElement employeeNameText;
	
	@FindBy(xpath="//p[text()='Create Login Details']/following::span[1]")
	WebElement createCredentials;
	
	@FindBy(xpath="//label[text()='Username']/following::input[1]")
	WebElement userNameTxt;	
	public void provideAdminRights(String useRole,String Status, String empName, String userName, String password) {
		try {
		WaitUtilities.elementToBeclickable(adminLink);
		WaitUtilities.elementToBeclickable(addButton);
		WaitUtilities.elementToBeclickable(userRoleDrop);
		selectdropdown(useRole);
		WaitUtilities.elementToBeclickable(statusDrop);
		selectdropdown(Status);
		WaitUtilities.visibilityOfElement(employeeNameText, "enterText", empName);
		WaitUtilities.elementToBeclickable(listItemsbox);
		WaitUtilities.visibilityOfElement(userNameTxt, "enterText", userName);
		WaitUtilities.visibilityOfElement(passwordText, "enterText", password);
		WaitUtilities.visibilityOfElement(confPassword, "enterText", password);
		WaitUtilities.elementToBeclickable(saveButton);
				
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
		public void selectdropdown(String value) {
		WebElement box=listItemsbox;
		List<WebElement> items=box.findElements(By.tagName("span"));
		for(WebElement item:items) {
			if(item.getText().equals(value)) {
				item.click();
				break;
			}
		}
}
			
}
