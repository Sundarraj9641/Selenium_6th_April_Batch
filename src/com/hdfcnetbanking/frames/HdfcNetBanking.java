package com.hdfcnetbanking.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HdfcNetBanking {
	WebDriver driver;
	@BeforeTest
	public void launch_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		
	}
	
	@Test
	public void frames() throws InterruptedException {
		
		driver.switchTo().frame("login_page");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy Policy")).click();
	}
}
