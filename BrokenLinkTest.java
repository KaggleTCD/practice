package com.selenium.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.facebook.com/");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links = webDriver.findElements(By.xpath("//a"));
		links.addAll(webDriver.findElements(By.tagName("img")));
		List<WebElement> properLink = new ArrayList<>();
		for(WebElement link:links) {
			if(link.getAttribute("href")!=null && (!link.getAttribute("href").contains("javascript"))) {
				
				properLink.add(link);
			}
		}
		
		System.out.println(links.size());
		System.out.println(properLink.size());
		
		for(WebElement link:properLink) {
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
				connection.connect();
				String responseMessage = connection.getResponseMessage();
				connection.disconnect();
				System.out.println("Active Links= "+link.getAttribute("href")+" "+responseMessage);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
