package scsm1.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import scsm1.genericLibrary.BaseClass;
@Listeners(scsm1.genericLibrary.ListenerImplementation.class)
public class MarketPlace extends BaseClass {
	@Test
	public void addons()
	{
	driver.findElement(By.id("MP_lin")).click();
	String s=driver.findElement(By.xpath("//h1[text()='OrangeHRM Addons']")).getText();
	System.out.println(s);
	}

}
