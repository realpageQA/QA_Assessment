Feature: User creates an account

  Scenario: User can create an account
    Given Diana is on HomePage
    When the user clicks on Sign in
    And user enters dianaj.meza@gmail.com
    And User Clicks create account
    And User fills sign up form
      |Diana|Meza|test123|Diana|Meza|Real Page|Test Address 1|Test Address 2|Medellin|00000|Additonal Information|+57 6138453|+57 3015289631|Home|
    And User clicks register
    Then the user is taken my account page

Scenario: User can log in account
  Given Diana has a valid account
  When when user clicks on sign in
    And enters dianaj.meza@gmail.com as email
    And enters test123 as password
    And clicks sign in
  Then the user is successfully logged in
