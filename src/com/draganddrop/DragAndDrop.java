package com.draganddrop;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	
	@BeforeTest
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://jqueryui.com/droppable/");
		String title = driver.getTitle();
		System.out.println("Title =====>" + title);
		String url = driver.getCurrentUrl();
		System.out.println("Url =====>" + url);
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		String after_drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		
		System.out.println("***** Text After Drop *****" + after_drop);
		
		Assert.assertEquals(after_drop, "Dropped!");
		System.out.println("We get the expected output");
	}
	
	@AfterTest
	public void close_browser() {
		driver.quit();
	}

}
