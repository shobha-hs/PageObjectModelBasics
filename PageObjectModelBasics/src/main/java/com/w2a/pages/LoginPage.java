package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
//	By email = By.xpath("");

	public ZohoAppPage doLogin(String username, String password) {

		type("email_XPATH", username);
		click("next_XPATH");
		type("password_XPATH", password);
		click("signbtn_XPATH");

		return new ZohoAppPage();
	}

	public void gotoSalesandMarketing() {

	}

	public void gotoFinance() {

	}

}
