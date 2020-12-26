@Book @Regression
Feature: Book


    @TestCase-3  @smoke @sanity        #Test Case 3
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

