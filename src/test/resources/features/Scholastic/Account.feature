@Account @Regression
Feature: Account


  @TestCase-1  @smoke @sanity
  Scenario: User can create a new teacher account in taxable state using Zip Code
    #Given I am on the landing page of Scholastic
    And I click on create an account
    And I select as Teacher
    And I click on next
    Then I put in my Title as 'Mr.'
    And I put in my First Name as 'Scrum'
    And I put in my Last Name as 'Master'
    And I put in my Email Address as 'scrumleadtest80@schl.com'
    And I put in my password as 'testpassword123'
    And I click on the terms and use agreement box
    Then I click on next after the TOS agreement
    And I put in '10012' as the zip code
    And I click on search button
    Then I choose my School name as 'Scholastic Book Clubs'
    And I click on next by School Name
    And I select 'Teacher by Grade' as my Role
    And I select '1st Grade' as the Grade
    And I enter '1' as Number of Students
    Then I click next on my Role
    And I select 'Guided Reading Level' as preferred reading level
    And I click continue to site
    Then I pull up the screen pop up
    And I click on My Account then Profile to verify the class codes are equal
    And I verify if the teacher name is the same
    And I verify if the school address is the same



     @TestCase-2  @sanity
    Scenario: User can create a new teacher account in taxable state using School Search
      And I click on create an account
      And I select as Teacher
      And I click on next
      Then I put in my Title as 'Mr.'
      And I put in my First Name as 'Scrum'
      And I put in my Last Name as 'Master'
      And I put in my Email Address as 'scrumleadtest81@schl.com'
      And I put in my password as 'testpassword123'
      And I click on the terms and use agreement box
      Then I click on next after the TOS agreement
      And I'm selecting 'New York' as the School State
      And I'm selecting 'New York' as the City
      And I click on search button using School Search
      Then I choose my School name as 'Scholastic Book Clubs'
      And I click on next by School Name
      And I select 'Teacher by Grade' as my Role
      And I select '1st Grade' as the Grade
      And I enter '1' as Number of Students
      Then I click next on my Role
      And I select 'Guided Reading Level' as preferred reading level
      And I click continue to site
      Then I pull up the screen pop up
      And I click on My Account then Profile to verify the class codes are equal
      And I verify if the teacher name is the same
      And I verify if the school address is the same




   @TestCase-4  @sanity
  Scenario: User can create a new teacher account in non-taxable state using Zip Code
    And I click on create an account
    And I select as Teacher
    And I click on next
    Then I put in my Title as 'Mr.'
    And I put in my First Name as 'Scrum'
    And I put in my Last Name as 'Master'
    And I put in my Email Address as 'scrumleadtest82@schl.com'
    And I put in my password as 'testpassword123'
    And I click on the terms and use agreement box
    Then I click on next after the TOS agreement
    And I put in '99518' as the zip code
    And I click on search button
    Then I choose my School name as 'Adak School'
    And I click on next by School Name
    And I select 'Teacher by Grade' as my Role
    And I select '1st Grade' as the Grade
    And I enter '1' as Number of Students
    Then I click next on my Role
    And I select 'Guided Reading Level' as preferred reading level
    And I click continue to site
    Then I pull up the screen pop up
    And I click on My Account then Profile to verify the class codes are equal
    And I verify if the teacher name is the same
    And I verify if the school selected has the same address



