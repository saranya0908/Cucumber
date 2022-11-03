package com.amazoniframe.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/feature/AmazonIframe.feature",
		glue="com.amazoniframe.stepdefinition",
		plugin = {"pretty", "html:report/todayreport.html"}
)



public class AmazoniFrameRunner {

}
