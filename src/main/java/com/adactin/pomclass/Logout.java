package com.adactin.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	@FindBy(id="logout")
	private WebElement logout_btn;

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
