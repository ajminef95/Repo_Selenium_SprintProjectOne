package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateAcc extends BasePage {

      //Locators

      By clickOnTeacherLoc = By.xpath("//span[text()='Teacher/Administrator/Homeschooler']");
      By clickingNextLoc = By.id("linkChooseAcount");
      By MrLoc = By.xpath("//span[text()='Mr.']");

      By TitleLoc = By.xpath("//div[@class='selected-option input-select profile-title required']");
      By FirstNameLoc = By.id("dwfrm_profile_customer_firstname");
      By LastNameLoc = By.id("dwfrm_profile_customer_lastname");
      By EmailAddLoc = By.id("dwfrm_profile_customer_email");
      By PasswordLoc = By.id("dwfrm_profile_login_password");
      By TermsAgreementLoc = By.id("dwfrm_registration_termsofuseteacher");
      By clickNextLocInCreateAcc = By.xpath("//button[@name='dwfrm_profile_confirm']");

      By zipCodeLoc = By.id("dwfrm_myschool_schoolzip");
      By ClickSearchByZipCodeLoc = By.id("button-search");

      By MySchoolNameLoc = By.id("dwfrm_searchschool_schoolvalue");
      By ScholasticBookClubLoc = By.xpath("//span[@class='ui-menu-item-wrapper' and contains (text(), 'scholastic+book+clubs')]");
      By SchoolSearchNextButtonClickLoc = By.xpath("//button[@class='next-button button-continue school-search']");

      By MyRoleLoc = By.xpath("//div[text()='Select Role']");
      By TeacherByGradeLoc = By.xpath("//span[text()='Teacher (by Grade)']");
      By GradeLoc = By.xpath("//div[@class='selected-option input-select noscroll']");
      By FirstGradeLoc = By.xpath("//span[text()='1st Grade']");
      By NumberOfStudentsLoc = By.id("dwfrm_myrole_students");
      By NextOnMyRoleClickLoc = By.xpath("//button[@name='dwfrm_myrole_findgrade']");

      By PrefReadingLevelLoc = By.xpath("//div[@class='selected-option input-select required']");
      By GuidedLevelLoc = By.xpath("//span[text()='Guided Reading Level (GRL)']");
      By ContinueToSiteClickLoc = By.xpath("//button[@name='dwfrm_profileselection_confirmed']");
      By PullUpThePopCurtainLoc = By.xpath("//span[@class='notification-chevron fa fa-chevron-up']");

      By ClickSchoolStateLoc = By.xpath("//div[@class='custom-select']");
      By ClickSchoolStateNYLoc = By.xpath("//li[@class='custom-option select-option']/following::span[contains(text(), 'New York')]");
      By SendKeysInSchoolCityLoc = By.id("dwfrm_myschool_schoolcity");
      By ClickSchoolCitySuggestionsLoc = By.xpath("//span[@class='auto-matches' and contains(text(), 'New York')]");
      By ClickSearchBySchoolLoc = By.xpath("//button[@name='dwfrm_myschool_searchone']");

      By ClickAdakSchoolLoc = By.xpath("//span[@class='auto-matches' and contains(text(), 'adak')]");




      //Methods

    public void selectTeacherAcc () {
        clickThis(clickOnTeacherLoc);

    }

    public void FirstClickNextOnCreateAcc () {
        clickThis(clickingNextLoc);
    }

    public void clickingTitle () {
        clickThis(TitleLoc);
        clickThis(MrLoc);



    }

    //public void selectTitle (String data) {

        //String TitleToSelect = "Mr.";
//
        //List<WebElement> titles = Web.getDriver().findElements(TitleLoc);

       // for (WebElement title: titles) {
        //    if (title.getText().equalsIgnoreCase(TitleToSelect)) {
         //       title.click();
              //  break;

           // Method didn't work with the Select process.

    //} } }

    public void EnterFirstName (String data) {
        type(FirstNameLoc, data);

    }

    public void EnterLastName (String data) {
        type(LastNameLoc, data);

    }

    public void EnterEmail (String data) {
        type(EmailAddLoc, data);

    }

    public void EnterPassword (String data) {
        type(PasswordLoc, data);

    }

    public void ClickTermsAgreement () {
        clickThis(TermsAgreementLoc);

    }

    public void SecondClickNext () {
        clickThis(clickNextLocInCreateAcc);

    }

    public void EnterZipCode (String data) {
        clickThis(zipCodeLoc);
        type(zipCodeLoc, data);

    }

   public void clickSearchByZip () {
        clickThis(ClickSearchByZipCodeLoc);

   }

   public void TypeSchoolName (String data) {

        type(MySchoolNameLoc, data);
        clickThis(ScholasticBookClubLoc);





        //WebElement ScholasticBookClub = findElementUsingFluentWait(ScholasticBookClubLoc);
        //String ScholasticBookClubText = ScholasticBookClub.getText();

        //List<WebElement> schools = Web.getDriver().findElements(MySchoolNameLoc);

        //for (WebElement school : schools) {
            //if (school.getText().equalsIgnoreCase(ScholasticBookClubText)) {
                //school.click();
              //  break;

            //}   //This way of process didn't work either.
        //}


   }

   public void SelectSchoolSearchNext () {
        clickThis(SchoolSearchNextButtonClickLoc);
   }


   public void SelectMyRole () {
        clickThis(MyRoleLoc);
        clickThis(TeacherByGradeLoc);

   }


   public void SelectGrade () {
        clickThis(GradeLoc);
        clickThis(FirstGradeLoc);

   }


   public void EnterNumberOfStudents (String data) {
        clickThis(NumberOfStudentsLoc);
        type(NumberOfStudentsLoc, data);

   }

   public void clickNextOnMyRole () {
        clickThis(NextOnMyRoleClickLoc);
   }

   public void SelectPreferredReadingLevel () {

        clickThis(PrefReadingLevelLoc);
        clickThis(GuidedLevelLoc);

   }

   public void clickContinueToSite () {
        clickThis(ContinueToSiteClickLoc);
   }

   public void PullTheOnScreenPopUp () {
        sleepTime();
        clickThis(PullUpThePopCurtainLoc);
   }


   public void sleepTime () {
        sleep();

   }




   //test case - 2

    public void SelectSchoolState () {

        clickThis(ClickSchoolStateLoc);
        clickThis(ClickSchoolStateNYLoc);



    }


    public void SelectingCity (String data) {

        clickThis(SendKeysInSchoolCityLoc);
        type(SendKeysInSchoolCityLoc, data);
        WebElement NewYorkC = findElementUsingFluentWait(ClickSchoolCitySuggestionsLoc);
        List<WebElement> SchoolCitySuggestionsElem = Web.getDriver().findElements(ClickSchoolCitySuggestionsLoc);

        String NewYorkText = NewYorkC.getText();
        for (WebElement suggestions : SchoolCitySuggestionsElem) {
            if (suggestions.getText().equalsIgnoreCase(NewYorkText)) {

                clickThis(ClickSchoolCitySuggestionsLoc);
                break;

            }


        }

    }


    public void clickSearchBySchool () {

        clickThis(ClickSearchBySchoolLoc);

    }


    public void SecondTypeSchoolName (String data) {

        type(MySchoolNameLoc, data);
        clickThis(ClickAdakSchoolLoc);


    }




}











