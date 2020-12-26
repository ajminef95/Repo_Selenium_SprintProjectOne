package stepDefinition.Scholastic;

import Pages.Scholastic.AfterCreatingAccPage;
import Pages.Scholastic.CreateAcc;
import Pages.Scholastic.HomePage;
import Pages.Scholastic.MyReadingClubAccPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class accountSD {

    HomePage hPage = new HomePage();
    CreateAcc CaPage = new CreateAcc();
    AfterCreatingAccPage AfcPage = new AfterCreatingAccPage();
    MyReadingClubAccPage MyRCAPPage = new MyReadingClubAccPage();



    @And("^I click on create an account$")
    public void clickingCreateAnAcc () {

        hPage.clickCreateAnAcc();

    }

    @And("^I select as Teacher$")
    public void selectingTeacher () {
        CaPage.sleepTime();
        CaPage.selectTeacherAcc();
    }

    @And("^I click on next$")
    public void clickingNextAfterTeacher () {

        CaPage.FirstClickNextOnCreateAcc();
    }

     @Then("^I put in my Title as 'Mr.'$")
     public void selectingTitle () {

        CaPage.sleepTime();
        CaPage.clickingTitle();



     }

     @And("^I put in my First Name as '(.+)'$")
     public void EnteringFirstName (String data) {
        CaPage.sleepTime();
        CaPage.EnterFirstName(data);
     }

     @And("^I put in my Last Name as '(.+)'$")
     public void EnteringLastName (String data) {

        CaPage.EnterLastName(data);
     }

     @And("^I put in my Email Address as '(.+)'$")
     public void EnteringEmailAddress (String data) {

        CaPage.EnterEmail(data);
     }

     @And("^I put in my password as '(.+)'$")
     public void EnteringPassword (String data) {

        CaPage.EnterPassword(data);
     }

     @And("^I click on the terms and use agreement box$")
     public void clickingOnTOSBox () {
        CaPage.sleepTime();
        CaPage.ClickTermsAgreement();

     }

     @Then("^I click on next after the TOS agreement$")
     public void clickingNextAfterTOSBox () {

        CaPage.SecondClickNext();
         CaPage.sleepTime();
     }


     @And("^I put in '(.+)' as the zip code$")
     public void EnteringZipCode (String data) {
        CaPage.sleepTime();
        CaPage.EnterZipCode(data);

     }

     @And("^I click on search button$")
     public void clickingSearchByZip () {
        CaPage.sleepTime();
        CaPage.clickSearchByZip();
     }


     @Then("^I choose my School name as 'Scholastic Book Clubs'$")
     public void SelectingSchoolName () {
        CaPage.sleepTime();
        CaPage.TypeSchoolName("Scholastic+B");
        CaPage.sleepTime();
     }

     @And("^I click on next by School Name$")
     public void clickingNextOnSchoolSearch () {
        CaPage.SelectSchoolSearchNext();
        CaPage.sleepTime();

     }

     @And("^I select 'Teacher by Grade' as my Role$")
     public void selectingMyRole () {
        CaPage.sleepTime();
        CaPage.SelectMyRole();
        CaPage.sleepTime();
     }

     @And("^I select '1st Grade' as the Grade$")
     public void selectingGrade () {
       CaPage.sleepTime();
        CaPage.SelectGrade();
     }

     @And("^I enter '(.+)' as Number of Students$")
     public void EnteringNumberOfStudents (String data) {
        CaPage.EnterNumberOfStudents(data);

     }

     @Then("^I click next on my Role$")
     public void clickingNextOnMyRole () {
        CaPage.clickNextOnMyRole();
        CaPage.sleepTime();
     }

     @And("^I select 'Guided Reading Level' as preferred reading level$")
     public void SelectingPreferredReadingLvl () {
        CaPage.sleepTime();
        CaPage.SelectPreferredReadingLevel();
     }

     @And("^I click continue to site$")
     public void clickingContinueToSite () {
        CaPage.sleepTime();
        CaPage.clickContinueToSite();
     }

     @Then("^I pull up the screen pop up$")
     public void PullingTheScreenPopUp () {
        CaPage.sleepTime();
        CaPage.PullTheOnScreenPopUp();
     }

     //@And("^I click on My Account and Profile$")
     //public void clickingMyAccountAndProfile () {

       // CaPage.sleepTime();
       //  String classCodeTxtAFC = AfcPage.getClassCodeText();
        //AfcPage.clickMyAccountAndProfile();

    // }







     @And("^I click on My Account then Profile to verify the class codes are equal$")
     public void verifyClassCode () {
         String classCodeTxtAFC = AfcPage.getClassCodeText();
         AfcPage.clickMyAccountAndProfile();
         CaPage.sleepTime();


         Assert.assertEquals(classCodeTxtAFC, MyRCAPPage.ReadingAccCCText());



         }











         @And("^I verify if the school address is the same$")
         public void VerifySchoolAddress () {

         CaPage.sleepTime();
         MyRCAPPage.VerifyingSchoolAddress();

         Assert.assertTrue(MyRCAPPage.VerifyingSchoolAddress());



         }

         @And("^I verify if the teacher name is the same$")
         public void VerifyTeacherName () {
             CaPage.sleepTime();
             Assert.assertTrue(MyRCAPPage.VerifyingTeacherName());


         }

         @And("^I'm selecting 'New York' as the School State$")
         public void SelectingSchoolState () {

             CaPage.sleepTime();
             CaPage.SelectSchoolState();


         }

         @And("^I'm selecting '(.+)' as the City$")
         public void SelectingCity (String data) {

           CaPage.sleepTime();
           CaPage.SelectingCity(data);


         }

         @And("^I click on search button using School Search$")
         public void clickingSearchBySchool () {

             CaPage.sleepTime();
             CaPage.clickSearchBySchool();


         }

         @Then("^I choose my School name as 'Adak School'$")
         public void SelectAdakSchool () {

           CaPage.sleepTime();
           CaPage.SecondTypeSchoolName("Adak");
           CaPage.sleepTime();



         }

         @And("^I verify if the school selected has the same address$")
         public void VerifyAdakSchoolAddress () {

            CaPage.sleepTime();

            Assert.assertTrue(MyRCAPPage.VerifyAdakSchoolAddress());



         }





     }
