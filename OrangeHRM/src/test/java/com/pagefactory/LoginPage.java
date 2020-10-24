package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy (how= How.XPATH, using ="//*[@name='txtUsername']")
	private WebElement username;

	@FindBy (how= How.XPATH, using ="//*[@id='txtPassword']")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}
	
	 
	
	
	

}
