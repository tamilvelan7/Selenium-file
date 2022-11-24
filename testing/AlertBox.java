package com.selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertBox {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Robot rt=new Robot();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert();
		TakesScreenshot ss=(TakesScreenshot) driver; 
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss4.png");
		FileHandler.copy(from, to);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("(//button)[3]")).click();
//		Thread.sleep(7000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button)[4]")).click();
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		WebElement element = driver.findElement(By.xpath("(//button)[5]"));
//		JavascriptExecutor execut=(JavascriptExecutor)driver;
//		execut.executeScript("arguments[0].click()", element);
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Tamilvelan");
//		Thread.sleep(2000);
//		alert.accept();
//		TakesScreenshot ss2=(TakesScreenshot)driver;
//		File from = ss2.getScreenshotAs(OutputType.FILE);
//		File to =new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss2.png");
//		Thread.sleep(1000);
//		FileUtils.copyFile(from, to);
//		Thread.sleep(1000);
//		driver.navigate().to("https://letcode.in/alert");
//		driver.findElement(By.id("accept")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[.='Confirm Alert']")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.id("prompt")).click();
//		Thread.sleep(1000);
//		Alert alert2 = driver.switchTo().alert();
//		alert2.sendKeys("Hiiii");
//		alert2.accept();
//		TakesScreenshot ss3=(TakesScreenshot)driver;
//		File from1 = ss3.getScreenshotAs(OutputType.FILE);
//		File to1 =new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss3.png");
//		FileHandler.copy(from1, to1);
//		driver.findElement(By.id("modern")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button)[5]")).click();
//		driver.close();
	}
}
