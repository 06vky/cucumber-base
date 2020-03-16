package com.pages;

import org.base1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BaseClass {

	public ConfirmationPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "book_now")
	private WebElement btnCon;
	@FindBy(id = "order_no")
	private WebElement order;
	@FindBy(id = "my_itinerary")
	private WebElement btnIternary;
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement btnCancel;

	public WebElement getBtnCon() {
		return btnCon;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getBtnIternary() {
		return btnIternary;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

}
