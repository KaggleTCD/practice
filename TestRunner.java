package com.cucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Selenium\\practice\\src\\main\\java\\com\\cucumber\\test\\bbc.feature"},
				 glue= {"com.cucumber.test"},
				 format= {"pretty","html:test-output"},
				 dryRun=false,
				 monochrome = true,
				 strict=true	
		)
public class TestRunner {
	
	

}
