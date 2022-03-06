Feature: Signup

  Background: Signup test
    Given I am at TalentTEK homepage

  @signup @hb
  Scenario: Sign in after creating a brand new test account
    And I create a brand new student account
    And I click on Login link
    When I login with brand new student credentials
    Then I should be able to successfully login

  @signup @hb
  Scenario Outline: Signup with different sets of test data
    And I enter my "<First Name>" and "<Last Name>"
    And I enter my "<Email Address>"
    And I enter "<Password>" and confirm my "<Confirm Password>"
#    And I enter DOB and pick gender
#    And I agree with the terms
#    When I click Create my Account button
#    Then My new account should be created
    Examples:
    |First Name|Last Name|Email Address|Password|Confirm Password|
    |Akash|Khan|akash.khan@gmail.com|Test$1234|Test$1234|
    |Sky|Khan|akash.khan1@gmail.com|Test$1234|Test$1234|
    |blueSky|Khan|akash.khan2@gmail.com|Test$1234|Test$1234|
