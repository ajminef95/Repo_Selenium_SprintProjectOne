@Book @Regression
Feature: Book


    @TestCase-3 @smoke @sanity
  Scenario: Teacher can add books in Recommendations List from Quick View
    #Given I am on the landing Page
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I type in 'Harry' on search and click the search button
    Then I choose the Book and click on Quick Look
    And I add the book using the Recommended Star and close all
    Then I click on My Lists and then Recommendations
    And I verify if the book is added in the wishlist


    @TestCase-7 @sanity
  Scenario: Verify teacher can add multiple books for a student in SFO
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I hover to Enter Orders
    And I select Student Flyer Orders
    Then I type 'Harry' as the Student Name
    And I type '16B3' as the Item Number
    And I click on the Add Button
    And I type '35J3' as the Item Number
    And I click on the Add Button
    And I scroll down
    Then I verify the correct student name 'Harry' was added
    And I verify the correct item numbers for Harry was added
    Then I add quantity for items
    And I click on Review Cart
    And I scroll down
    Then I verify the quantity is the same as chosen for Harry
    And I verify the price total for Harry
    And I verify the SFO price is the same price total


  @TestCase-8 @sanity
  Scenario: Verify teacher can add multiple books for multiple students in SFO
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I hover to Enter Orders
    And I select Student Flyer Orders
    Then I type 'Harry' as the Student Name
    And I type '16B3' as the Item Number
    And I click on the Add Button
    And I type '35J3' as the Item Number
    And I click on the Add Button
    Then I type 'John' as the Student Name
    And I type '35S3' as the Item Number
    And I click on the Add Button
    Then I type 'Michael' as the Student Name
    And I type '35N3' as the Item Number
    And I click on the Add Button
    And I scroll down
    Then I verify the correct student name 'Harry' was added
    And I verify the correct item numbers for Harry was added
    And I verify the correct student name 'John' was added
    And I verify the correct item numbers for John was added
    And I verify the correct student name 'Michael' was added
    And I verify the correct item numbers for Michael was added
    Then I add quantity for items of Harry
    And I add quantity for items of John
    And I add quantity for items of Michael
    And I click on Review Cart
    And I scroll down
    Then I verify the quantity is the same as chosen for Harry
    And I verify the price total for Harry
    Then I verify the quantity is the same as chosen for John
    And I verify the price total for John
    Then I verify the quantity is the same as chosen for Michael
    And I verify the price total for Michael
    Then I verify the SFO price total is the same as their total combined



  @TestCase-10 @sanity
  Scenario: Verify user can delete item on Cart page
    And I click on sign in
    Then I put my 'scrumleadtest14@schl.com' as my email
    And I put 'testpassword123' as my password
    And I click the sign in button with my credentials
    Then I pull up the screen pop up
    And I hover to Enter Orders
    And I select Student Flyer Orders
    And I scroll down
    And I click on Review Cart
    Then I delete item 16B3 of Harry
    And I verify that there was a price change total for Harry
    And I verify the item change for Harry
    And I scroll down
    And I verify the price change total for all
    And I verify the total item changes






