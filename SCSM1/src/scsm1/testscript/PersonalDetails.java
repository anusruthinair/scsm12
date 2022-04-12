package scsm1.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import scsm1.genericLibrary.BaseClass;

public class PersonalDetails extends BaseClass{
	@Test(groups= {"smoke","system"})
	public void myinfo()
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		String s=driver.findElement(By.xpath("//h1[text()='Personal Details']")).getText();
		System.out.println(s);
	}

}
