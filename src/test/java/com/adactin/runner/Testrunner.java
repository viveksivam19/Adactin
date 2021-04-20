package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",glue ="com.adactin.stepdefine" )

public class Testrunner {
	public static WebDriver driver;

@BeforeClass

	public static void setup() {
	driver = Baseclass.getBrowser("chrome");

	}
	
//@AfterClass
//public static void teardown() {
	//Baseclass.close();

//}
}
