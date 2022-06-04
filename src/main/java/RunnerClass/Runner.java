package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/CucumberBBD/src/main/java/FeatureFile/Login.feature",
        glue = "StepDefinitions",
        stepNotifications = true,
        dryRun = true
        )
public class Runner {

}
   // dry run will not execute, but it will check the feature file and stepdefinition are correctly mapped with eachother, it will validate and verification, self evalution
   // strict is deprecated in cucumber 6, strict will execute and check if both the feature and stepdefinition
