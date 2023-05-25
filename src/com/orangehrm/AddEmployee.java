package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AddEmployee {
	WebDriver driver;

	@BeforeTest
	public void launch_browser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority=1)
	public void login() throws InterruptedException {

		//username
		WebElement username = driver.findElement(By.name("username"));

		username.sendKeys("Admin");

		//password
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

		password.sendKeys("admin123");

		//login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		login.click();
	}

	@Test(priority=2)
	public void pim_link() {
		//pim
		WebElement pim = driver.findElement(By.linkText("PIM"));

		pim.click();
	}

	@Test(priority=3)
	public void add_employee() {

		//add
		WebElement add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

		add.click();

		//firstname
		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));

		first_name.sendKeys("Sundar");

		//lastname
		WebElement last_name = driver.findElement(By.name("lastName"));

		last_name.sendKeys("Raj");

		//login details
		WebElement Log_del = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));

		Log_del.click();

		//username
		WebElement user_name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));

		user_name.sendKeys("sundar@154904");

		//password
		WebElement pass_word = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));

		pass_word.sendKeys("Sundar@12345");

		//confirm password
		WebElement con_pass = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));

		con_pass.sendKeys("Sundar@12345");

		//enable
		WebElement enable = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/input"));

		if(!enable.isSelected()) {
			enable.click();
		}

		//save
		WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));

		save.click();
		
		//ssn
		WebElement ssn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
		
		ssn.sendKeys("123456");
		
		//nationality
		//WebElement nation = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
		
		//nation.click();
		
		WebElement india = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
		
		india.getAttribute("value");
		

	}

	@AfterTest
	public void close_browser() {
		//close the browser
		//driver.quit();
	}


}


