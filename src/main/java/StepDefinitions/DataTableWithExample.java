package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableWithExample {

    public static WebDriver driver;

    @Given("procced with login page")
    public void procced_with_login_page() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

    }
    @When("Using the {string} and {string} in the login page")
    public void usig_the_and_in_the_login_page(String username, String password) {
//        String name = keyvaluepair.get(0).get("Username");
//        String pass = keyvaluepair.get(0).get("Password");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
    }
    @When("Click on the button")
    public void click_on_the_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("close all the browser")
    public void close_all_the_browser() {
       driver.close();
    }

}
