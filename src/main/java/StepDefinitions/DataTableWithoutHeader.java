package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DataTableWithoutHeader {

    public static WebDriver driver;

    @Given("you are in the login page")
    public void you_are_in_the_login_page() {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @When("you should enter the login credentials")
    public void you_should_enter_the_login_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String> credentials = dataTable.asList(String.class); // this is used to retreive the data from feature file

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(credentials.get(0));
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(credentials.get(1));
    }
    @When("you should click the login button")
    public void you_should_click_the_login_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("finally close the browser")
    public void finally_close_the_browser() {

        driver.close();

    }

}
