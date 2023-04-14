package com.smartbear.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/smartbear",
        glue = "com/smartbear/stepdefinitions",
        dryRun = false,
        tags = "@QA_smartBearRegression",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}
)
public class SmartBearRunner {
}
