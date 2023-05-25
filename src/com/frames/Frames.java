package com.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;

	@BeforeTest
	public void launch_browser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	}
	@Test
	public void frames() throws InterruptedException {
		Thread.sleep(3000);

		//enter into the frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();

		//get the text from the web page
		String pkg=driver.findElement(By.xpath("/html/body/main/div[1]/h1")).getText();


		//print the text get from the web page
		System.out.println("Text : " + pkg);

		//exit from the frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		//enter into the another frame
		driver.switchTo().frame("packageListFrame");

		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();

		//exit from the frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		//enter into the another frame
		driver.switchTo().frame("packageFrame");

		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[13]/a/span")).click();
	}
	
	@AfterTest
	public void close_browser() {
		driver.close();
	}

}
