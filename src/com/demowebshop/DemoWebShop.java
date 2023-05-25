package com.demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DemoWebShop {

		WebDriver driver;

		@BeforeTest
		public void launch_browser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://demowebshop.tricentis.com/login");
		}
}
