package actitime.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actitime.genericLibrary.BaseClass;

public class FetchTitle extends BaseClass{
	@Test
	public void getTitle()
	{
		driver.findElement(By.cssSelector(".content.reports")).click();
		String title=driver.getTitle();
		System.out.println("title is:"+ title);
	}

}
