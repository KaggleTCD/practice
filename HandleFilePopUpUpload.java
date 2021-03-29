package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilePopUpUpload {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		webDriver.findElement(By.xpath("//*[@id='myFile']")).sendKeys("C:\\Users\\phipartners\\Downloads\\Vishnu.png");
	}

}
