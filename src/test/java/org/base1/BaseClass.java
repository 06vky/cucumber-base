package org.base1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MYPC\\eclipse-workspace\\CucumberBase\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		screensShot();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);


	}

	public void fill(WebElement element, String name) {

		element.sendKeys(name);
		

	}
	 public void type(WebElement element, String name) {
	element.sendKeys(name);
	 
	 }

	public void btnclick(WebElement element) {
		element.click();
	
	}

	public void selectTextByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
		
	}

	public void selectTextByAttribute(WebElement element, String name) {
		new Select(element).selectByValue(name);
		
	}

	public void selectValueByText(WebElement element, String name) {
		new Select(element).selectByVisibleText(name);
		
	}

	public void typejs(WebElement element, String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("aruguments[0].setAttribute('value','" + name + "')", element);
		
	}

	public String generateRandomData() {
		return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date());

	}

	public String getTextByAttribute(WebElement element) {

		return element.getAttribute("value");
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void screensShot() {

		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destLoc = new File("C:\\Users\\MYPC\\eclipse-workspace\\CucumberBase\\Screenshot" + generateRandomData() + ".png");
		try {
			FileUtils.copyFile(s, destLoc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void quitBrowser() {
		driver.quit();
	}

}


