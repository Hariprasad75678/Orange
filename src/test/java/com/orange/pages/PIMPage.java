package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.utils.BaseClass;
import com.orange.utils.WaitUtilities;

public class PIMPage extends BaseClass {

	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement PimLink;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addButton;
	
		
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstnameTxt;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastnameTxt;
	
	@FindBy(xpath="//label[text()='Employee Id']/following::input[1]")
	WebElement EmployeeIdTxt;
	
	@FindBy(xpath="//p[text()='Create Login Details']/following::span[1]")
	WebElement createCredentials;
	
		
	@FindBy(xpath="//label[text()='Username']/following::input[1]")
	WebElement UsernameTxt;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement PasswordTxt;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement ConfirmPasswordTxt;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveButton;
	
	@FindBy(xpath="//button[text()=' Search ']")
	WebElement SearchButton;
	
	@FindBy(xpath="//label[text()='Employee Name']/following::input[1]")
	WebElement employeeNameText;
	
	
	
	
	public String CreateEmployee(String fName,String lName,String username, String password) {
		try {
			WaitUtilities.elementToBeclickable(PimLink);

		//	PIMLink.click();
			WaitUtilities.elementToBeclickable(addButton);

		//	addButton.click();
			WaitUtilities.visibilityOfElement(firstnameTxt, "enterText", fName);

		//	firstNameTxt.sendKeys(Fname);
			WaitUtilities.visibilityOfElement(lastnameTxt, "enterText", lName);

		//	lastNameTxt.sendKeys(lname);
			WaitUtilities.elementToBeclickable(createCredentials);

		//	onCheckBox.click();
			
			WaitUtilities.visibilityOfElement(UsernameTxt, "enterText", username);

		//	UsernameTxt.sendKeys(uname);

			WaitUtilities.visibilityOfElement(PasswordTxt, "enterText", password);

		//	PasswordTxt.sendKeys(pwd);

			WaitUtilities.visibilityOfElement(ConfirmPasswordTxt, "enterText", password);

		//	ConfirmPasswordTxt.sendKeys(pwd);

			WaitUtilities.elementToBeclickable(SaveButton);

		//	SaveButton.clear();
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
		return password;
	}
		public void SearchEmployee(String empName) {
			try {
				PimLink.click();
				employeeNameText.sendKeys(empName);
				SearchButton.click();		
			}
		catch(Exception e) {
			e.printStackTrace();
		
		}
	}
}
