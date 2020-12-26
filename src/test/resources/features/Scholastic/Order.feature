@Order @Regression
Feature: Order

  @TestCase-6 @smoke @sanity        #Test Case 6
  Scenario: Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
    #Given I am on the landing page
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I hover to Enter Orders
    And I select Student Flyer Orders
    Then I type 'Harry' as the Student Name
    And I type '111' as the Item Number
    And I click on the Add Button
    Then I verify if the Error Message For Item is Displayed




    @TestCase-11 @sanity   #Test Case 11
    Scenario: Verify YTO-By Flyer jumper
      #Given I am on the landing page
      And I click on sign in
      Then I put my 'scrumleadtest14@schl.com' as my email
      And I put 'testpassword123' as my password
      And I click the sign in button with my credentials
      Then I pull up the screen pop up
      And I hover to Enter Orders
      And I select Your Teacher Order
      And I scroll down
      And I click on Quantity Box
      Then I verify the Jumper Message is Displayed
      And I close the Jumper Message
      And I click on Quantity Box for another item
      Then I verify the Jumper Message is not Displayed

