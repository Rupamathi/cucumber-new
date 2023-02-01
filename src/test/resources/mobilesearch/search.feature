Feature: User Authentication
#Background: launch 
#Given launch url "https://www.google.com"

@smoke
Scenario: the user enter in gmailsigin page 
Given the user is on the login page
When the user inputs the correct email address onedim list
|rupamathiekambaram|1234576|rupayuva|
And the user inputs the correct password 
And the user clicks the Login button
Then the user should be authenticated
And the user should be presented with a success message

@sanity
Scenario Outline: I am user of facebooks 
Given I am in facebook login page 
When I enter unvalid username as "<username>" 
And I enter the unvalid password "<password>" 
Then I should not be redirected to the home page of facebook

Examples:
|username||password|
|rupamathi||12345|