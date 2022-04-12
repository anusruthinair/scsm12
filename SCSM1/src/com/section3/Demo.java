package com.section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> pdtname=driver.findElements(By.xpath("//div[starts-with(text(),'APPLE iPhone')]"));
		for(WebElement pname:pdtname)
		{
			String s=pname.getText();
			String price=driver.findElement(By.xpath("//div[text()='"+s+"']/../../div[2]/div[1]/div[1]/div")).getText();
			System.out.println(s+"------------>"+price);
		}
	}
}
		