package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksExample {

    @Given("your in before tag")
    public void your_in_before_tag() {
       System.out.println("Before tag");
    }
    @When("user enter the login")
    public void user_enter_the_login() {
        System.out.println("in login");
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        System.out.println("login button clicked tag");
    }
    @Then("your in after tag")
    public void your_in_after_tag() {
        System.out.println("after tag");
    }
    @Then("close the browsers")
    public void close_the_browsers() {
        System.out.println("close tag");
    }

}
