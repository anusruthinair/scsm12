package com.section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataprovider {
	@Test(dataProvider="DataSupplier")
	public void login(String username,String password)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanay My Prince\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@DataProvider
	public Object[][] DataSupplier()
	{
		Object[][] objarr = new Object[3][2];
		objarr[0][0]="Admin";
		objarr[0][1]="admin123";
		objarr[1][0]="Admin2";
		objarr[1][1]="admin1232";
		objarr[2][0]="Admin3";
		objarr[2][1]="admin1233";
		return objarr;
		
	}

}
