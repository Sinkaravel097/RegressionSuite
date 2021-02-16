Feature: To validate the login functionality

  Background: 
    Given user has to launch the chrome browser and hit the url of facebook

  @sanity
  Scenario: To verify the login functionality
    When user has to enter the username and password
      | username             | password       |
      | vishal@gmail.com     | vishalgmail    |
      | sinkaravel@gmail.com | sinkaravelmail |
    And click the login button

  Scenario: To validate forgot password link
    When user has to click forgot password link
    And user has to enter the mobno on mobno field
    And click the search button

  @sanity
  Scenario: To validate the create new account
    When click create new account button
    And user has enter the first name and last name
    And user has to enter the mobile num or password
    And user has to enter the new password
    And user has to select date of birth
    And user has to click gender
