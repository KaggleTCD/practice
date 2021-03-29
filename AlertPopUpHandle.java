package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		webDriver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		webDriver.switchTo().alert().accept();
		webDriver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = webDriver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		webDriver.quit();

	}

}
