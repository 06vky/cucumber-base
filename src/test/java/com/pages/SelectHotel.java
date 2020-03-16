package com.pages;

import org.base1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement f;

	@FindBy(id = "last_name")
	private WebElement l;
	@FindBy(id = "address")
	private WebElement a;
	@FindBy(id = "cc_num")
	private WebElement c;

	@FindBy(id = "cc_type")
	private WebElement n;
	@FindBy(id = "cc_exp_month")
	private WebElement m;
	@FindBy(id = "cc_exp_year")
	private WebElement y;
	@FindBy(id = "cc_cvv")
	private WebElement v;

	public WebElement getF() {
		return f;
	}

	public WebElement getL() {
		return l;
	}

	public WebElement getA() {
		return a;
	}

	public WebElement getC() {
		return c;
	}

	public WebElement getN() {
		return n;
	}

	public WebElement getM() {
		return m;
	}

	public WebElement getY() {
		return y;
	}

	public WebElement getV() {
		return v;
	}

}

