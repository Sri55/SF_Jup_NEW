package org.teamjupiter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// Associates Cucumber-JVM with the JUnit runner
 @RunWith(Cucumber.class)
 @CucumberOptions(
         features = "src/test/java/Features",
         glue = {"org.teamjupiter"},
         plugin = {"json:target/raw_reports/cucumber.json"},
         tags = {"not @bug", "not @indeed"},
         monochrome = true
 )
 public class RunCukesTest {

 }

