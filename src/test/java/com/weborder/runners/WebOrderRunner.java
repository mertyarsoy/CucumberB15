package com.weborder.runners;
/*
THESE ARE INTERVIEW QUESTIONS:
*Runner class is a class to run your all feature files from here.(Regression,smoke, etc...)
a)@RunWith --> Automation comes from JUnit, and it executes the feature file steps
b)@CucumberOptions --> It is a special annotation that has some keyword inside it
   **features --> This is the location of feature files(this one should be "CONTENT ROOT")
   **glue --> This is the location of step definition files(this one should be "SOURCE ROOT")
   **dryRun --> This is a way to get snips without executing the whole steps from beginning
   **tags --> It is a way to specialize your scenario for the specific tag(Regression,smoke, etc...)(filtration)
   **plugin --> It is a way to integrate the specific condition for the keyword.(Mostly used for report card)
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder", // feature files
        glue = "com/weborder/stepdefinitions", // step-definition files
        dryRun = false, // getting snips without executing
        tags = "@QA_demoRegression", // and refers to scenario
        // or refers to multiple scenarios
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)
public class WebOrderRunner {
}
