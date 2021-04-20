package com.adactin.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookhotel {

	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement Credit_No;
	

	@FindBy(id="cc_type")
	private WebElement Card_Type;
	
	

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_No() {
		return Credit_No;
	}

	public WebElement getCard_Type() {
		return Card_Type;
	}

	public WebElement getExp_Month() {
		return Exp_Month;
	}

	public WebElement getExp_Yr() {
		return Exp_Yr;
	}

	public WebElement getCcv_No() {
		return Ccv_No;
	}

	public WebElement getBook_Now() {
		return Book_Now;
	}

	@FindBy(id="cc_exp_month")
	private WebElement Exp_Month;
	
	

	@FindBy(id="cc_exp_year")
	private WebElement Exp_Yr;
	
	@FindBy(id="cc_cvv")
	private WebElement Ccv_No;
	
	@FindBy(id="book_now")
	private WebElement Book_Now;

}
