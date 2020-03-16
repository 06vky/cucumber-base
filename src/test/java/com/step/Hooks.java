package com.step;

import org.base1.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.*;







public class Hooks extends BaseClass {
	WebDriver driver;
	@Before
public void beforeScenario() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");
		
	}
	
	@After() 
	public void afterScenario(Scenario sc) {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] s =tk.getScreenshotAs(OutputType.BYTES);
		System.out.println(s);
		sc.embed(s,"image/png");
	}
}
