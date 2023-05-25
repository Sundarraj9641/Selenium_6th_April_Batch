package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertDemo {
	WebDriver driver;
	
	@BeforeTest
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		
	}
	
	@Test
	public void alertDemo() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert a1 = driver.switchTo().alert();;
		a1.accept();
		
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(1000);
		a2.accept();
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a3 = driver.switchTo().alert();
		Thread.sleep(1000);
		a3.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Alert a4 = driver.switchTo().alert();
		Thread.sleep(1000);
		a4.sendKeys("Sundarraj");
		a4.accept();
		
		
	}

}
