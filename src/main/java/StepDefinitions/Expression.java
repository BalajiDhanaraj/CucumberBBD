package StepDefinitions;

import io.cucumber.java.en.Given;

public class Expression {

    /*  @Given("I have (\\d+\\) laptop") *//*//*/
    // "(\\d+)" is the integer regular expression*//*
    // "(\\d+\\.\\d+)" is the floating regular expression
    // " (.*?) this will accept all kind of data type, without line break --> println
    // how to escaping the string (\"(.*?)\") <--> (\"([^\"]*)\") this will use to print the data in Double quotes like --->"walker"
    //
    //  public void i_have_laptop(Integer count) {
    //    System.out.println("lap"+count); */

    @Given("I have {int} laptop")
    public void i_have_laptop(Integer count) {
        System.out.println(" laptop count \""+count+"\"");
    }
    @Given("I got {double} CGP")
    public void i_got_cgp(Double cgp) {
        System.out.println("CRP \""+cgp+"\" is high ");
    }
    @Given("{string} is my friend and also {string}")
    public void is_my_friend_and_also(String name, String team) {
        System.out.println("My friend name is \""+name+"\" and is team is  \""+team+"\" ");
    }


}
