Feature: User creates an account

  Scenario: User can create an account
    Given Diana is on HomePage
    When the user clicks on Sign in
    And user enters emailtest@gmail.com
    And User Clicks create account
    And User fills sign up form
      |name|last name|test123|Name1|Name2|Real Page|Test Address 1|Test Address 2|Medellin|00000|Additonal Information|+57 0001111|+57 3334445566|Home|
    And User clicks register
    Then the user is taken my account page

Scenario: User can log in account
  Given Diana has a valid account
  When when user clicks on sign in
    And enters emailtest@gmail.com as email
    And enters test123 as password
    And clicks sign in
  Then the user is successfully logged in
