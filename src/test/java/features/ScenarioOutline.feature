Feature: Test login validation using scenario outline
  Background: Navigate to the signup page
    Given I am at TalentTEK homepage


  Scenario: Enter email and password through the feature file
    Given I enter "TTCjWgmk" for username
    And I enter "123456" for password
    And I click on Login button
    Then I should be able to successfully login

  Scenario: Use data table in the feature file
    Given I enter the username and password
      |TTCjWgmk|123456|
      |TTCBoQIy|123456|

  Scenario Outline: This is to use scenario outline
    Given I enter <Username> and <Password>
    When I click on Login button
    Then I should see the error message <Error>

    Examples:
      |Username|Password|Error|
      |TTCjWgmk|dsfasdfasdf|You have entered an incorrect email or student Id.|
      |dsfsdffd|fdsfsdfsdf |You have entered an incorrect email or student Id.|