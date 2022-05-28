package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/CucumberBBD/src/main/java/FeatureFile/LoginWithData.feature", glue = "StepDefinitions")
public class Runner {

}
