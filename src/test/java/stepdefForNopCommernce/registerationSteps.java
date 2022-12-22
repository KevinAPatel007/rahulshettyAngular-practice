package stepdefForNopCommernce;

import PagesForNopCommernce.HomePage;
import PagesForNopCommernce.Registration;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverManager;
import org.hamcrest.MatcherAssert;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class registerationSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    Registration registration = new Registration();
    List<Map<String, String>> data;

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {


    }

    @When("^I enter my first name$")
    public void firstname() throws Throwable {
registration.firstname();
    }
    @When("^I enter my email$")
    public void email() throws Throwable {
        registration.email();
    }
    @When("^I enter my password$")
    public void password() throws Throwable {
        registration.password();
    }
    @When("^I click on submit btn$")
    public void i_click_on_submit_btn() throws Throwable {
      registration.setSubmitBtn();
    }

    @When("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable dataTable) throws Throwable {
        data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        registration.enterRegistrationDetails(
                data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("password"),
                data.get(0).get("confirmPassword")
        );
    }

    @When("^I click on the \"([^\"]*)\" on registration page$")
    public void i_click_on_the_on_registration_page(String regSubmitButton) throws Throwable {
        registration.clickOnRegistrationButton();
    }

    @Then("^I should see \"([^\"]*)\" text on registration page$")
    public void i_should_see_text_on_registration_page(String expText) throws Throwable {
        String actualRegiSuccessText = registration.getTextFromRegistrationResult();
        assertThat(actualRegiSuccessText, is(equalToIgnoringCase(expText)));
    }

    @When("^I click on the \"([^\"]*)\"$")
    public void i_click_on_the(String headerName) throws Throwable {
        homePage.clickOnRegister();
        Thread.sleep(1000);
    }



    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expUrl) throws Throwable {
        String actualUrl = driverManager.geturl();
        MatcherAssert.assertThat(actualUrl, containsString(expUrl));

    }
    @When("^I buy a book \"([^\"]*)\"$")
    public void i_buy_a_book(String arg1) throws Throwable {
       homePage.AddtoCart();
    }


}

