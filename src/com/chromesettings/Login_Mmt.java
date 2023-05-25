package com.chromesettings;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login_Mmt {
	WebDriver driver;
	ChromeOptions options;
	
	
	@BeforeTest

	public void launch() {

		System.out.println("Welcome to the Make My Trip...........");
		String userProfile= "C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--start-maximized");

		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("username")).isEnabled());
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("znj7by@myinfoinc.com");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Sundar@1234");
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
	}
	
	@Test
	public void my_profile() {
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p"));
		Actions a = new Actions(driver);
		WebElement prf = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[2]/a[1]/div/p[1]"));
		a.moveToElement(profile).moveToElement(prf).click(prf).build().perform();
		
		
	}
	


}
