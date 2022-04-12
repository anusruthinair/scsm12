package scsm1.genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
    public	WebDriver driver;
    public DataUtility du=new DataUtility();
    public static WebDriver listenerDriver;
   
    @BeforeClass(alwaysRun=true)
	public void launchBrowser()
   {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium2\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		listenerDriver=driver;
	 }
    	
    	
    
    @BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDatafromProperty("url"));
		driver.findElement(By.id("txtUsername")).sendKeys(du.getDatafromProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(du.getDatafromProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
    @AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
    @AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}
