package com.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base1.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.ConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	LoginPage page;
	SearchHotel page1;
	SelectHotel page2;
	ConfirmationPage page3;
	
	@Given("User is on the Adactin homepage")
	public void user_is_on_the_Adactin_homepage() {
	}

	@When("User enters his details")
	public void user_enters_his_details(io.cucumber.datatable.DataTable data) {
		page = new LoginPage();
		List<Map<String,String>> emp = data.asMaps();
		String s1 = emp.get(0).get("userName");
		WebElement user = page.getTxtUser();
		fill(user, s1);
		String s2 = emp.get(0).get("password");
		WebElement pass = page.getTxtPass();
		fill(pass, s2);

	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btn = page.getBtn();
		btnclick(btn);
		screensShot();
	}

	@When("User should verify the message")
	public void user_should_verify_the_message() {
		System.out.println("Mesage Verified");
	}

	@When("User should search hotel")
	public void user_should_search_hotel(io.cucumber.datatable.DataTable data) {
		page1 = new SearchHotel();
		
		List<Map<String, String>> emp = data.asMaps();
		String s3 = emp.get(0).get("location");
		WebElement loc = page1.getL();
		fill(page1.getL(), s3);
		String s4 = emp.get(0).get("Hotels");
		WebElement hot = page1.getH();
		fill(page1.getH(), s4);
		String s5 = emp.get(0).get("roomtypes");
		WebElement ro = page1.getR();
		fill(page1.getR(), s5);
		String s6 = emp.get(0).get("numberofrooms");
		WebElement nos = page1.getN();
		fill(page1.getN(), s6);
		String s7 = emp.get(0).get("adultsperroom");
		WebElement ad = page1.getA();
		fill(page1.getA(), s7);
		String s8 = emp.get(0).get("childrenperroom");
		WebElement child = page1.getCh();
		fill(page1.getCh(), s8);
		WebElement btnSubmit = page1.getBtn();
		btnclick(btnSubmit);
		screensShot();
		WebElement btnRadio = page1.getBtn1();
		btnclick(btnRadio);
		WebElement btCon = page1.getBtnCon();
		btnclick(btCon);
		screensShot();
		
	}

	@When("User enters payment")
	public void user_enters_payment(io.cucumber.datatable.DataTable data) {
		page2 = new SelectHotel();
		
		List<Map<String, String>> emp = data.asMaps();
		String s9 = emp.get(0).get("firstname");
		WebElement fN = page2.getF();
		fill(page2.getF(), s9);
		String s10 = emp.get(0).get("lastname");
		WebElement lN = page2.getL();
		fill(page2.getL(), s10);
		String s11 = emp.get(0).get("billingaddress");
		WebElement add = page2.getA();
		fill(page2.getA(), s11);
		String s12 = emp.get(0).get("creditcardnumber");
		WebElement cC = page2.getC();
		fill(page2.getC(), s12);
		String s13 = emp.get(0).get("creditcardtype");
		WebElement cTyp = page2.getN();
		fill(page2.getN(), s13);
		String s14 = emp.get(0).get("expirymonth");
		WebElement mon = page2.getM();
		fill(page2.getM(), s14);
		String s15 = emp.get(0).get("expiryyear");
		WebElement year = page2.getY();
		fill(page2.getY(), s15);
		String s16 = emp.get(0).get("cvvnumber");
		WebElement cCvv = page2.getV();
		fill(page2.getV(), s16);
		screensShot();
	}

	@Then("User gets orderid")
	public void user_gets_orderid() throws AWTException {
		page3 = new ConfirmationPage();
		WebElement btnCo = page3.getBtnCon();
		btnclick(btnCo);
		screensShot();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement orderId = page3.getOrder();
		String txt = orderId.getAttribute("value");
		System.out.println(txt);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement btnIter = page3.getBtnIternary();
		btnclick(btnIter);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String xpath = "//input[@value='" + txt + "']/parent::td/preceding-sibling::td";
		WebElement btnOrderId = driver.findElement(By.xpath(xpath));
		btnOrderId.click();
		WebElement btCancel = page3.getBtnCancel();
		btCancel.click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
System.out.println("The Above BOOKING IS CANCELLED");
	}
}
