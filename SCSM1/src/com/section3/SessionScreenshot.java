package com.section3;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SessionScreenshot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/selenium_batch/Registration%20page.html");
		WebElement checkbox=driver.findElement(By.cssSelector("[placeholder='username']"));
		System.out.println(checkbox.getAccessibleName());
	}
}
