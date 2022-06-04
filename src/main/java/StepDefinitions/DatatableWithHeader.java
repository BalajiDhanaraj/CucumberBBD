package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class DatatableWithHeader {

    public static WebDriver driver;

    @Given("your are in the login page")
    public void your_are_in_the_login_page() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

    }
    @When("your should enter the login credentials")
    public void your_should_enter_the_login_credentials(DataTable dataTable) {

        // we are going to use Map collection
        List<Map<String,String>> keyvaluepair = dataTable.asMaps(String.class,String.class);
        // this is used to retreive the data from feature file

        String name = keyvaluepair.get(0).get("Username");
        String pass = keyvaluepair.get(0).get("Password");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(name);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pass);

    }
    @When("your should click the login button")
    public void your_should_click_the_login_button() {
      driver.findElement(By.name("Submit")).click();
    }
    @Then("final close the browser")
    public void final_close_the_browser() {
     driver.close();
    }
}
