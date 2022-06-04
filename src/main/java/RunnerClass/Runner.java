package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/CucumberBBD/src/main/java/FeatureFile/",
        glue = "StepDefinitions",
        stepNotifications = true,
        dryRun = true,
        monochrome = true,
        tags = "@Simplelogin",
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
   // one feature file can multiple scenarios

 
