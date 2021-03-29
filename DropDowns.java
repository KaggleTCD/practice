package com.selenium.practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		webDriver.manage().window().maximize();
		WebElement findElement = webDriver.findElement(By.xpath("//*[@id='select-demo']"));
		Select select = new Select(findElement);
		select.selectByVisibleText("Sunday");
	}

}
//asdfghjkl123456dekhlo
//Dekhlo@2020