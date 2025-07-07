package com.milo.SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		// Luanch a chrome broser/safari browser
		WebDriver driver = new ChromeDriver();
		// Navigate to a site
		driver.get("https://www.google.com");
		// get the Title
		driver.getTitle();	// Type something
		// Click something
		

	}

}
