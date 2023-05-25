package com.newtour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTour {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://demo.guru99.com/selenium/newtours/reservation.php");
		
		driver.findElement(By.linkText("Flights")).click();
		
		//type
		WebElement type = driver.findElement(By.cssSelector("input[type='radio'][value = 'oneway']"));
		
		type.click();
		
		//passenger Count
		WebElement count = driver.findElement(By.name("passCount"));
		
		Select s1 = new Select(count);
		
		s1.selectByVisibleText("4");
		
		//Departing from
		WebElement from = driver.findElement(By.name("fromPort"));
		
		Select s2 = new Select(from);
		
		s2.selectByValue("New York");
		
		//from month
		WebElement from_month = driver.findElement(By.name("fromMonth"));
		
		Select s3 = new Select(from_month);
		
		s3.selectByValue("6");
		
		//from day
		WebElement from_day = driver.findElement(By.name("fromDay"));
		
		Select s4 = new Select(from_day);
		
		s4.selectByValue("25");
		
		//Arriving in
		WebElement arrive = driver.findElement(By.name("toPort"));
		
		Select s5 = new Select(arrive);
		
		s5.selectByValue("Paris");
		
		//return month
		WebElement return_month = driver.findElement(By.name("toMonth"));
		
		Select s6 = new Select(return_month);
		
		s6.selectByValue("8");
		
		//return day
		WebElement return_day = driver.findElement(By.name("toDay"));
		
		Select s7 = new Select(return_day);
		
		s7.selectByValue("4");
		
		//service class
		WebElement service_class = driver.findElement(By.cssSelector("input[type='radio'][value = 'First']"));
		
		service_class.click();
		
		//airline
		WebElement airline = driver.findElement(By.name("airline"));
		
		Select s8 = new Select(airline);
		
		s8.selectByVisibleText("Unified Airlines");
		
		//continue
		WebElement cont = driver.findElement(By.name("findFlights"));
		
		cont.click();
		
		

	}

}
