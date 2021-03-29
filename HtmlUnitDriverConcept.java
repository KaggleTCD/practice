package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		
		WebDriver webDriver = new HtmlUnitDriver();
		webDriver.get("http://www.facebook.com");
		System.out.println(webDriver.getTitle());

	}

}
