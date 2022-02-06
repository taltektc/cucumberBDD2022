Feature: Login Test

  @login @hb
  Scenario: Login with valid email and password
    Given I am at TalentTEK homepage
    And I enter valid email address
    And I enter valid password
    When I click on Login button
    Then I should be able to successfully login

  Scenario: Login with valid email and invalid password
    Given I am at TalentTEK homepage
    And I enter valid email address
    And I enter invalid password
    When I click on Login button
    Then I should be able to successfully login

  Scenario: Login with invalid email and valid password
    Given I am at TalentTEK homepage
    And I enter invalid email address
    And I enter valid password
    When I click on Login button
    Then I should be able to successfully login

  Scenario: Login with invalid email and password
    Given I am at TalentTEK homepage
    And I enter invalid email address
    And I enter invalid password
    When I click on Login button
    Then I should be able to successfully login