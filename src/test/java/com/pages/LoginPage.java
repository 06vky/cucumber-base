package com.pages;

import org.base1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver,this);	
	
	}

@FindBy(id="username")
private WebElement txtUser;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(id="login")
private WebElement btn;

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtn() {
	return btn;
}




	
}


