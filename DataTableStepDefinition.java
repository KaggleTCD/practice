package com.cucumber.datatable.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefinition {
	
	WebDriver webDriver;
	
	@Given("^User is on bbc page$")
	public void user_is_on_bbc_page(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get("https://www.bbc.co.uk/");
	}

	@When("^Title of the page is BBC - Home$")
	public void title_of_the_page_is_BBC_Home(){
	
		String title = webDriver.getTitle();
		Assert.assertEquals(title, "BBC - Home");
	}

	@Then("^User clciks on Sign in button$")
	public void user_clciks_on_Sign_in_button() {

		webDriver.findElement(By.linkText("Sign in")).click();
	}

	@Then("^User enters the credentials$")
	public void user_enters_the_credentials(DataTable data){
		
		List<Map<String, String>> asMaps = data.asMaps(String.class,String.class);
		for(Map<String, String> map:asMaps) {
			
			String username = map.get("username");
			String password = map.get("password");
			webDriver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(username);
			webDriver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(password);
		}

	}

	@Then("^User clicks on Sign in Button$")
	public void user_clicks_on_Sign_in_Button(){

		webDriver.findElement(By.xpath("//*[@id='submit-button']")).submit();
	}

}
