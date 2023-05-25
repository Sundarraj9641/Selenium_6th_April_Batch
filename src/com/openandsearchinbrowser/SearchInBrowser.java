package com.openandsearchinbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInBrowser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement google_Search_box = driver.findElement(By.name("q"));
		
		google_Search_box.sendKeys("Capgemini");
		
		Thread.sleep(1000);
		
		WebElement google_search_button = driver.findElement(By.name("btnK"));
		
		google_search_button.click();
		
		String title = driver.getTitle();
		System.out.println("The Title : " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("The Url : " + url);
		
		driver.close();		
		
		
		
	}

}
