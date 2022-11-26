package com.play.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "com.play.bdd.steps",
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}
