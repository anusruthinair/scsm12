package actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.genericLibrary.BaseClass;
@Listeners(actitime.genericLibrary.ListenerImp.class)
public class SupportVesrion extends BaseClass {
	@Test
	public void getVersion()
	{
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add User']")));
		String s=driver.findElement(By.xpath("//div[text()='Add User']")).getText();
		System.out.println(s);
		
	}

}
