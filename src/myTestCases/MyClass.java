package myTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass {
	WebDriver driver = new ChromeDriver();
	

	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		
	}
	
	
	
	@Test()
	public void login () throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		
		
		
	}
	
	
	
	@AfterTest
	public void myPOSTTESTING () {
		
	}
	
	
}
