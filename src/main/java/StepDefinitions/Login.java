package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @When("user enter the login username and password")
    public void user_enter_the_login_username_and_password() {

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("user is nagivate to home page")
    public void user_is_nagivate_to_home_page() {
      String title = driver.getTitle();
      System.out.println("title"+title);
    }
    @Then("close the browser")
    public void close_the_browser() {

        driver.close();
    }

}
