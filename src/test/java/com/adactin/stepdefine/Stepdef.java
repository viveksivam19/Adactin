package com.adactin.stepdefine;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.pomclass.Loginpage_adactin;
import com.adactin.pomclass.Search_Hotel;
import com.adactin.runner.Testrunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Baseclass{
	public static WebDriver driver= Testrunner.driver;
	
	public static Loginpage_adactin login = new Loginpage_adactin(driver);
	public static Search_Hotel search = new Search_Hotel(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	geturl("https://adactinhotelapp.com/index.php");	
	}

	@When("^user Enter The username in username Textbox$")
	public void user_Enter_The_username_in_username_Textbox() throws Throwable {
		inputvalueElement(login.getUsrname(), "VivekSivam19");
	}

	@When("^user Enter The password in Password Textbox$")
	public void user_Enter_The_password_in_Password_Textbox() throws Throwable {
		inputvalueElement(login.getPwd(), "Vivek@0096");
	}

	@Then("^user Click On Login Button and It Navigates To Select Hotel Page$")
	//second
public void user_Click_On_Login_Button_and_It_Navigates_To_Select_Hotel_Page() throws Throwable {
clickonElement(login.getLogin());
	}
	
	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
dropdown(search.getLocation(), "2", "selectbyindex");
	}

	@When("^user Select hotel$")
	public void user_Select_hotel() throws Throwable {
		dropdown(search.getHotels(), "2", "selectbyindex");
	}

	@When("^select room type$")
	public void select_room_type() throws Throwable {
		dropdown(search.getRoomtype(), "2", "selectbyindex");
	    }

	@When("^select room no of room$")
	public void select_room_no_of_room() throws Throwable {
		dropdown(search.getRoomnos(), "2", "selectbyindex");
	}

	@When("^select checkin date$")
	public void select_checkin_date() throws Throwable {
		inputvalueElement(search.getEntrydate(), "15/04/2021");
	}

	@When("^select checkout date$")
	public void select_checkout_date() throws Throwable {
		inputvalueElement(search.getExitdate(), "18/04/2021");
	}

	@When("^select Adult per room$")
	public void select_Adult_per_room() throws Throwable {
		dropdown(search.getAdult_Room(), "2", "selectbyindex");
		
	}

	@When("^select children per room$")
	public void select_children_per_room() throws Throwable {
		dropdown(search.getChild_Room(), "2", "selectbyindex");
	}

	@Then("^click on search it navigates to search Hotel page$")
//3rd
	public void click_on_search_it_navigates_to_search_Hotel_page() throws Throwable {
clickonElement(search.getSearch_btn());
	}
	
	@When("^user choose the hotel$")
	public void user_choose_the_hotel() throws Throwable {
		
		
	}

	@Then("^click on continue it navigates to book a hotel page$")
	public void click_on_continue_it_navigates_to_book_a_hotel_page() throws Throwable {
	}
	

}
