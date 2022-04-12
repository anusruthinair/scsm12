package actitime.testscript;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actitime.genericLibrary.BaseClass;

public class Customercreation  extends BaseClass{
@Test	
public void createCustomer() throws EncryptedDocumentException, IOException
	{
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector(".title.ellipsis")).click();
	driver.findElement(By.className("createNewCustomer")).click();
	Random r=new Random();
	int num=r.nextInt(1000);
	driver.findElement(By.className("newNameField")).sendKeys(num+du.getDataFromeExcel("Sheet1",0,0));
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	System.out.println("customer created");

}
}

