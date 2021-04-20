package com.adactin.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selecthotel {
	@FindBy(id="radiobutton_0")
	private WebElement click_Radio;
	
	@FindBy(id="continue")
	private WebElement Continue_btn;

	public WebElement getClick_Radio() {
		return click_Radio;
	}

	public WebElement getContinue_btn() {
		return Continue_btn;
	}

		
		


}
