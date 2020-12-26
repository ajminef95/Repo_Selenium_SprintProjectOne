@CreditCard @Regression
Feature: Credit Card





   @TestCase-5 @smoke @sanity           #Test Case 5
  Scenario: Verify teacher can add only 3 credit cards under My Credit Cards in My Accounts
    #Given I am on the landing Page
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I click on My Account and Profile
    Then I add a credit card
    And I scroll down to fill out all the information
    And I enter '4012888888881881' as the Card Number
    And I select '03' as the Month Expiration Date
    And I select '2022' as the Year Expiration
    And I enter '232' as the Security Code
    And I scroll down to fill out all the information
    And I enter 'Scrum' as my First Name
    And I enter 'Master' as my Last Name
    And I enter '5575' as my Address
    And I enter '10036' as my Zip Code
    And I enter '231-202-2940 as my Phone Number
    And I click on save to add the card
    Then I verify if the Error Message is Displayed by trying to add a new card

