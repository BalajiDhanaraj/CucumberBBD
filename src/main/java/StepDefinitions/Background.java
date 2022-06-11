package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
//    @Given("The student in science")
//    public void the_student_in_science() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("The student in engineering")
//    public void the_student_in_engineering() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("the student can study the science subject")
//    public void the_student_can_study_the_science_subject() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("the student can cleared")
//    public void the_student_can_cleared() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the student become scienctist")
//    public void the_student_become_scienctist() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Given("The student in science")
//    public void the_student_in_science() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("The student in engineering")
//    public void the_student_in_engineering() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("the student can study the engineering subject")
//    public void the_student_can_study_the_engineering_subject() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("the student can cleared and pass")
//    public void the_student_can_cleared_and_pass() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the studen become engineer")
//    public void the_studen_become_engineer() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


    @Given("The student in science")
    public void the_student_in_science() {
      System.out.println("in science");
    }

    @Given("The student in engineering")
    public void the_student_in_engineering() {
        System.out.println("in engineering");
    }


    @Given("the student can study the science subject")
    public void the_student_can_study_the_science_subject() {
        System.out.println("in science subject");
    }
    @When("the student can cleared")
    public void the_student_can_cleared() {
        System.out.println("the student had been cleared science");
    }
    @Then("the student become scienctist")
    public void the_student_become_scienctist() {
        System.out.println("become scientist");
    }

    @Given("the student can study the engineering subject")
    public void the_student_can_study_the_engineering_subject() {
        System.out.println("in engineering subject");
    }
    @When("the student can cleared and pass")
    public void the_student_can_cleared_and_pass() {
        System.out.println("in engineering cleared");
    }
    @Then("the studen become engineer")
    public void the_studen_become_engineer() {
        System.out.println("in engineering is passed");
    }


}
