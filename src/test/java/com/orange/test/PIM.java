package com.orange.test;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.pages.PIMPage;
import com.orange.utils.BaseClass;

public class PIM extends BaseClass{

	@Test(dataProvider="getTCData")
	public void TC1_CreateEmployee(HashMap<String,String> map) throws IOException{
		
		PIMPage pp=new PIMPage();
		String fName=map.get("FirstName")+getRandomNum();
		String userName=fName+" "+map.get("LastName");
		String empName = pp.CreateEmployee(fName, map.get("LastName"), userName,
				map.get("Password"));
		writeTestData("Sheet1", "TC2_SearchEmployee", "EmployeeName", empName);
	}
	@DataProvider
	public Object[][] getTCData(){
		return getData("TC1_CreateEmployee", "Sheet1");
	}
}
