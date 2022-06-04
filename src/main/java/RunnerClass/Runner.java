package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/CucumberBBD/src/main/java/FeatureFile/",
        glue = "StepDefinitions",
        stepNotifications = true,
        dryRun = false,
        monochrome = true,
        tags = "@Simplelogin,@Datatable",
        plugin = { "pretty", "html:/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/CucumberBBD/src/main/java/Report/cucumber-reports.html" }
        )
public class Runner {

}
   // dry run will not execute, but it will check the feature file and stepdefinition are correctly mapped with eachother, it will validate and verification, self evalution
   // strict is deprecated in cucumber 6, strict will execute and check if both the feature and step definition
   // dryrun and strict are support boolean
   // monochrome to print human readable details in console
   // format is deprecated instance of format we will use the Plugin to generate the report
   // Plugin   3 type of file format is ---> html, json, xml
   //  Tag ---> to execute the selected feature or scenario , if we dont want to execute  use " ~ "
   //  Runner class ---. we can use OR, AND condition
   // to execute the OR condtion will execute  if one of the tag is available in any of feature file
   // to execute the AND condtion  only if both tag name should be there in feature file
   // one feature file can multiple scenarios
   // Cucumber Hooks
   // it does not have Junit, HOOKs have own library for @Before and @After
   //

 
