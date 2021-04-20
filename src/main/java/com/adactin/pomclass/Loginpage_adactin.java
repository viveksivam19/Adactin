package com.adactin.pomclass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_adactin {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usrname;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="login")
	private WebElement login;
	public Loginpage_adactin(WebDriver driver2) {
		this.driver=driver2;
PageFactory.initElements(driver, this);
	}
	public WebElement getUsrname() {
		return usrname;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
