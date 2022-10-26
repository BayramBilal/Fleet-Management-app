package com.cydeo.fleetApp.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/fleetApp/step_definitions",
        dryRun = false,
        tags = "@wip2"


)

public class CukesRunner {
}
