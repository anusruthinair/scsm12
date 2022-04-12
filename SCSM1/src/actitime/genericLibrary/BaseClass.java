package actitime.genericLibrary;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import actitime.elementRepository.LoginLocators;



public class BaseClass {
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	public static WebDriver listenerDriver;
	@BeforeClass(alwaysRun=true)
	public void launchBrwser()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanay My Prince\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			listenerDriver=driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperty("url"));
		/*
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		*/
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDataFromProperty("username"),du.getDataFromProperty("password"));
		
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		/*
		driver.findElement(By.id("logoutLink")).click();
		*/
		LoginLocators ll=new LoginLocators(driver);
		ll.logout();
		
	}
	@AfterClass(alwaysRun=true)
	public void close()
	{
		driver.close();
	}

}
