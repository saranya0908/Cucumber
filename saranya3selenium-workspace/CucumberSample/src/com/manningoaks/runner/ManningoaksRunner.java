package com.manningoaks.runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) 

@CucumberOptions(
		features= "src/feature/OurSchool.feature",
		glue="com.manningoaks.stepdefinition",
		plugin = {"pretty", "html:C:\\Software Testing\\report\\todayreport.html"}
)

public class ManningoaksRunner {
	

}
