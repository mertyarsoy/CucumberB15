package com.etsy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/etsy", // feature files
        glue = "com/etsy/stepdefinitions", // step-definition files
        dryRun = false, // getting snips without executing
        tags = "@QA_etsyRegression", // and refers to scenario
        // or refers to multiple scenarios
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class EtsyRunner {
}
