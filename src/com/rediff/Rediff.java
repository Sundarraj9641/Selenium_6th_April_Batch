package com.rediff;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Rediff {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
			
	
			//firstname
			WebElement full_name = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
			
			full_name.sendKeys("Sundar raj");
			
			//id
			WebElement id = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
			
			id.sendKeys("sundarraj.1545");
			
			//checking availability
			WebElement check = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
			
			check.click();
			
			//password
			WebElement password = driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));
			
			password.sendKeys("Sundarraj@1234");
			
			//re enter password
			WebElement repassword = driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
			
			repassword.sendKeys("Sundarraj@1234");
			
			//email
			WebElement email = driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
			
			email.sendKeys("Sundarraj123@gmail.com");
			
			//checkbox
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
			
			checkbox.click();

			//security question
			WebElement question = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
			
			Select s1  = new Select(question);
			
			s1.selectByVisibleText("What is the name of your first school?");
			
			//answer
			WebElement answer = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
			
			answer.sendKeys("VMHS");
			
			
			WebElement mother_name = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input"));
			
			mother_name.sendKeys("Padmavathi");
			
			//WebElement mobile = driver.findElement(By.xpath("//*[@id=\"div_mob\"]/table/tbody/tr/td[3]/div[2]"));
			
			//Select m = new Select(mobile);
			
			//Thread.sleep(1000);
			//m.selectByVisibleText("India (+91)");
			
			WebElement no = driver.findElement(By.id("mobno"));
			
			no.sendKeys("1234567891");
			
			//day
			WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			
			Select d = new Select(day);
			
			d.selectByVisibleText("04");
			
			//month
			WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			
			Select m = new Select(month);
			
			m.selectByVisibleText("JAN");
			
			//year
			WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			
			Select y = new Select(year);
			
			y.selectByVisibleText("2001");
			
			//gender
			WebElement gender = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
			
			gender.click();
			

			//country
			WebElement country = driver.findElement(By.id("country"));
			
			Select s2  = new Select(country);
			
			s2.selectByVisibleText("India");
			
			//city
			WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
			
			Select s3  = new Select(city);
			
			s3.selectByValue("Chennai");

	}

}
