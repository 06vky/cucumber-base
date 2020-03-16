package com.runner;

import org.base1.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"com.step" }, monochrome = true, dryRun = false, plugin = {
				"json:src\\test\\resources\\Reporte\\cucumber.json" })
public class TestRunner {
	@AfterClass
	public static void afterclass() {
		JVMReport.generateJVMReport("C:\\Users\\MYPC\\eclipse-workspace\\CucumberBase\\src\\test\\resources\\Reporte\\cucumber.json");
	}
}
