Feature: Login Page feature

Scenario: Login Page title
Given User is on login page
When user gets the title of the page
Then page title should be "Human Resources Management Software | OrangeHRM HR Software"

Scenario: Forgot Password link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters the username"prajwalnichat11@gmail.com"
And user enters the password "Selenium@123"
And user click on login button
Then user gets the title of page 
And page title should be "My Account"