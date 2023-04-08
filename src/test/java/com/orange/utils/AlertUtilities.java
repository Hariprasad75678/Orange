package com.orange.utils;

import org.openqa.selenium.Alert;

public class AlertUtilities extends BaseClass{

	static Alert a;
	
	public static void acceptAlert() {
		a=driver.switchTo().alert();
		a.accept();
		
	}
	public static void dissmissAlert() {
		a=driver.switchTo().alert();
		a.dismiss();
	}
}
