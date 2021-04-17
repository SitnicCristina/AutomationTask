package com.endava.qa.gmail;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.endava.qa.gmail.steps",
        tags = {"@Gmail"},
        monochrome = false
)
public class Runner {
}
