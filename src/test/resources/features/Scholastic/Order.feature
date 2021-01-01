@Order @Regression
Feature: Order

  @TestCase-6 @smoke @sanity
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




    @TestCase-11 @sanity
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

      @TestCase-9 @sanity
      Scenario: Verify zero tax for only SFO order in the checkout
        And I click on sign in
        Then I put my 'scrumleadtest14@schl.com' as my email
        And I put 'testpassword123' as my password
        And I click the sign in button with my credentials
        Then I pull up the screen pop up
        And I hover to Enter Orders
        And I select Student Flyer Orders
        And I scroll down
        And I click on Review Cart
        And I scroll down
        And I scroll down
        And I scroll down
        And I click Proceed To Checkout
        And I scroll down
        And I scroll down
        And I scroll down
        And I click Proceed To Checkout again
        Then I verify the Tax Price is Zero


    @TestCase-12 @sanity
    Scenario: Verify zero tax for SFO-YTO orders in the checkout for teacher with non-tax state school
      And I click on sign in
      Then I put my 'alaskatest@schl.com' as my email
      And I put 'testpassword123' as my password
      And I click the sign in button with my credentials
      Then I pull up the screen pop up
      And I hover to Enter Orders
      And I select Student Flyer Orders
      Then I type 'Harry' as the Student Name
      And I type '16B3' as the Item Number
      And I click on the Add Button
      Then I type 'John' as the Student Name
      And I type '35S3' as the Item Number
      And I click on the Add Button
      And I hover to Enter Orders
      And I select Your Teacher Order
      And I scroll down
      And I enter '2' as quantity for one item
      And I enter '2' as quantity for another item
      And I scroll down
      And I scroll down
      And I click on Review Cart
      And I scroll down
      And I scroll down
      And I scroll down
      And I click Proceed To Checkout
      And I scroll down
      And I scroll down
      And I scroll down
      And I click Proceed To Checkout again
      Then I verify the Tax Price is Zero


    @TestCase-13 @sanity
    Scenario: Verify non-zero tax is present for SFO-YTO orders in the checkout for teacher with tax state school
      And I click on sign in
      Then I put my 'scrumleadtest14@schl.com' as my email
      And I put 'testpassword123' as my password
      And I click the sign in button with my credentials
      Then I pull up the screen pop up
      And I hover to Enter Orders
      And I select Your Teacher Order
      And I scroll down
      And I enter '2' as quantity for one item
      And I enter '2' as quantity for another item
      And I scroll down
      And I scroll down
      And I click on Review Cart
      And I scroll down
      And I scroll down
      And I scroll down
      And I click Proceed To Checkout
      And I scroll down
      And I scroll down
      And I scroll down
      And I click Proceed To Checkout again
      Then I verify the Tax Price is greater than Zero


  @TestCase-15 @sanity
  Scenario: Verify user can place an order by adding a new credit card
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I hover to Enter Orders
    And I select Your Teacher Order
    And I scroll down
    And I enter '2' as quantity for one item
    And I enter '2' as quantity for another item
    And I scroll down
    And I scroll down
    And I click on Review Cart
    And I scroll down
    And I scroll down
    And I scroll down
    And I click Proceed To Checkout
    And I scroll down
    And I scroll down
    And I scroll down
    And I click Proceed To Checkout again
    And I scroll down
    And I click on Continue To Checkout
    Then I click on 'Ship To My School' Radio Button
    And I scroll down
    And I select 'Credit Card' as my payment method
    And I select 'Add a New Card' as my card type
    And I enter '4012888888881881' as my card number
    And I select '03' for the Month Expiration Date
    And I select '2023' for the Year Expiration Date
    And I enter '232' as my security code
    And I scroll down
    And I put 'Scrum' as my First Name
    And I put 'Master' as my Last Name
    And I put '5571' as my Address
    And I put '10036' as my Zip Code
    And I put '231-202-2940' as my Phone Number
    And I scroll down
    And I untick the save card box
    And I click on Continue To Checkout again
    And I click on Submit Order
    Then I verify if 'Thank You For Your Order' is displayed
    And I verify if Your Customer Number is displayed







