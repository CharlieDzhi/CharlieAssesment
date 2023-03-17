package stepDefinition.sovTechContactUsStepDefs;

import PageObjects.LoginPage;
import PageObjects.RyzeDashboardPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RyzeDashboardStepDefs {

    LoginPage loginPage= new LoginPage();
    RyzeDashboardPage ryzeDashboardPage = new RyzeDashboardPage();


    @Given("^Given the User is logged on to ryze \"([^\"]*)\", \"([^\"]*)\"$")
    public void given_the_User_is_logged_on_to_ryze(String userName, String password) throws Exception {
        loginPage.Login(userName,password);
    }

    @Given("^User navigates to Repository->Studies$")
    public void user_navigates_to_Repository_Studies() throws Throwable {

        ryzeDashboardPage.NavigatesStudies();
    }

    @Given("^User enter the tech test study view$")
    public void user_enter_the_tech_test_study_view() {

        ryzeDashboardPage.NavigatesToTechStudy();
    }

    @Given("^User enter the Data acquisition asset group view$")
    public void user_enter_the_Data_acquisition_asset_group_view() {

        ryzeDashboardPage.NavigatesDataAcquisition();

    }

    @Given("^User Selects forms$")
    public void user_Selects_forms() throws Throwable {

        ryzeDashboardPage.NavigatesForms();

    }

    @Given("^User select to view the Medical History form$")
    public void user_select_to_view_the_Medical_History_form() throws Throwable {

        ryzeDashboardPage.NavigatesMedicalHistory();

    }

    @Given("^The user select to edit the form by adding a Description property to the form$")
    public void the_user_select_to_edit_the_form_by_adding_a_Description_property_to_the_form() throws Throwable {
       ryzeDashboardPage.EditButtonDescription();
    }

    @Given("^User saves the changes$")
    public void user_saves_the_changes() throws Throwable {

        ryzeDashboardPage.SaveButton();
    }

    @Given("^User confirms the updated changes$")
    public void user_confirms_the_updated_changes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^A a user logout of the application$")
    public void a_a_user_logout_of_the_application() throws Throwable {

        ryzeDashboardPage.Logout();
    }
}
