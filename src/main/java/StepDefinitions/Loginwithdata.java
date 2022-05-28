package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwithdata {

    public static WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @When("user enter the login {string} and {string}")
    public void user_enter_the_login_and(String username, String pass) {
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pass);
    }
    @When("user click the login button succesfully")
    public void user_click_the_login_button_succesfully() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("user is nagivate to home and view")
    public void user_is_nagivate_to_home_and_view() {
      driver.close();
    }
}
