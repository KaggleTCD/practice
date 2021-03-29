package com.cucumber.scenariooutline.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBCLoginScenarioOutline {
	
	WebDriver webDriver;
	
	@Given("^User is on the bbc page$")
	public void user_is_on_the_bbc_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get("https://www.bbc.co.uk/");
	}
	
	@When("^The title of the page is BBC - Home$")
	public void title_of_the_page_is_BBC_Home() {
		
		String title = webDriver.getTitle();
		Assert.assertEquals(title, "BBC - Home");
	}
	
	@Then("^User clicks on the Sign in Button$")
	public void user_clicks_on_the_Sign_in_Button() {
		
		webDriver.findElement(By.linkText("Sign in")).click();
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_credentials(String email,String password) {
		
		webDriver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(email);
		webDriver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(password);
	}
	
	@Then("^User clicks on the Sign in button$")
	public void user_clicks_on_the_Sign_in_button() {
		
		webDriver.findElement(By.xpath("//*[@id='submit-button']")).submit();
	}

}
