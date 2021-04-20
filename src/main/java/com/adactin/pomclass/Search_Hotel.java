package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	@FindBy(id = "datepick_in")
	private WebElement entrydate;

	@FindBy(id = "datepick_out")
	private WebElement exitdate;
	@FindBy(id = "datepick_in")
	private WebElement datepic;
	@FindBy(id = "adult_room")
	private WebElement Adult_Room;

	@FindBy(id = "child_room")
	private WebElement Child_Room;

	@FindBy(id = "Submit")
	private WebElement search_btn;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
PageFactory.initElements(driver, this);
	}



	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getEntrydate() {
		return entrydate;
	}

	public WebElement getExitdate() {
		return exitdate;
	}

	public WebElement getDatepic() {
		return datepic;
	}

	public WebElement getAdult_Room() {
		return Adult_Room;
	}

	public WebElement getChild_Room() {
		return Child_Room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

}
