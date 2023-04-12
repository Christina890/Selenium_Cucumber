package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("The user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        System.out.println("Ready to roll");
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Ready to roll");
    }
    @When("Hits Submit")
    public void hits_submit() {
        System.out.println("Ready to roll");

    }
    @Then("Then the user is logged in successfully")
    public void then_the_user_is_logged_in_successfully() {
        System.out.println("Ready to roll");
    }


}
