Feature: OrangeHRM Application LogIn Functionality Test
Scenario Outline: Validating LogIn Functionality
Given Open firefox browser and navigate to OrangeHRM application
When User enters valid "<Username>" and "<Password>" and click on signin button
Then User should be able to successfully login to OrangeHRM application and close
Examples:

 |Username| Password |
 |admin   | password |
 |hello   | password |