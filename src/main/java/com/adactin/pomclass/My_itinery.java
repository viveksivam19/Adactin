package com.adactin.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_itinery {
	@FindBy(name = "my_itinerary")
	private WebElement itinerary_btn;

	public WebElement getItinerary_btn() {
		return itinerary_btn;
	}


}
