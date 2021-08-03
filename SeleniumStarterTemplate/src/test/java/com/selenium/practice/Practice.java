package com.selenium.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	final static String URL ="https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	
	public static void main(String[] args) throws InterruptedException {
		try {
			
			WebDriverManager.chromedriver().setup();

			WebDriver driver = openBrowser();

			openUrl(URL, driver);
			
			//
			
			// Add Your Code Here
			
			//
			closeBrowser(driver);

		}

		catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	
	private static WebDriver openBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	private static void closeBrowser(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	private static void openUrl(String url, WebDriver driver) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
	}

	

}
