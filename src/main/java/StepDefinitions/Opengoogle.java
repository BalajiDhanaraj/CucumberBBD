package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

    WebDriver driver;


    @Given("Lanching the browser")
    public void lanching_the_browser() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();

    }
    @When("Opening the google site")
    public void opening_the_google_site() {
        driver.navigate().to("https://www.google.com/");

    }
    @Then("User typing the search term")
    public void user_typing_the_search_term() {

        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Steve jobs");
    }
    @Then("Enter the ruturn key")
    public void enter_the_ruturn_key() {

        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
    }
    @Then("Nagivated to search result")
    public void nagivated_to_search_result() {
       String name =  driver.getTitle();
       System.out.println(name);
    }
    @Then("Close the Browser")
    public void close_the_browser() {
        driver.close();
    }
}
