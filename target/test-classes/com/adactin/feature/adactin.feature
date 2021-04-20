Feature: Hotel booking in Adactin Application 


Scenario: 
Given user Launch The Application 
When user Enter The username in username Textbox 
And user Enter The password in Password Textbox 
Then user Click On Login Button and It Navigates To Select Hotel Page
Scenario:
When user select the location
And user Select hotel
And select room type
And select room no of room
And select checkin date 
And select checkout date
And select Adult per room
And select children per room 
Then click on search it navigates to search Hotel page
Scenario:
When user choose the hotel
Then click on continue it navigates to book a hotel page


