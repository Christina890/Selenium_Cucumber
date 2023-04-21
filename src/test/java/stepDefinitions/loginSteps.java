package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseClass;
import pageObjects.loginPage;

public class loginSteps extends BaseClass {

    @Given("The user is on the landing page")
    public void the_user_is_on_the_landing_page() {
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
    }
    @When("Hits Submit")
    public void hits_submit() {
      loginPage.submitLogin();

    }
    @Then("Then the user is logged in successfully")
    public void then_the_user_is_logged_in_successfully() {
        System.out.println("User is logged in successfully");
    }


}
