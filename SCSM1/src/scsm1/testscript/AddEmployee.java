package scsm1.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import scsm1.genericLibrary.BaseClass;
import scsm1.genericLibrary.DataUtility;

public class AddEmployee extends BaseClass {
	@Parameters("firstname")
	@Test
	  public void createEmployee(String firstname) throws EncryptedDocumentException, IOException
	  {
        WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(du.getDatafromExcel("Sheet1",1, 1));
		driver.findElement(By.id("btnSave")).click();
		System.out.println("employee created successfully");
		
		
		
	}

}
