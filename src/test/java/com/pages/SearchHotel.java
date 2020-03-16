package com.pages;

import org.base1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement l;

	@FindBy(id = "hotels")
	private WebElement h;

	@FindBy(id = "room_type")
	private WebElement r;

	@FindBy(id = "room_nos")
	private WebElement n;

	@FindBy(id = "adult_room")
	private WebElement a;

	@FindBy(id = "child_room")
	private WebElement ch;

	@FindBy(id = "Submit")
	private WebElement btn;
	@FindBy(id = "radiobutton_0")
	private WebElement btn1;

	@FindBy(id = "continue")
	private WebElement btnCon;
	public WebElement getBtn1() {
		return btn1;
	}

	public WebElement getBtnCon() {
		return btnCon;
	}
	public WebElement getL() {
		return l;
	}

	public WebElement getH() {
		return h;
	}

	public WebElement getR() {
		return r;
	}

	public WebElement getN() {
		return n;
	}

	public WebElement getA() {
		return a;
	}

	public WebElement getCh() {
		return ch;
	}

	public WebElement getBtn() {
		return btn;
	}

}