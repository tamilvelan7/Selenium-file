package com.selenium.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions mouse=new Actions(driver);
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		driver.get("https://demoqa.com/buttons");
		WebElement doubleck = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightclk = driver.findElement(By.id("rightClickBtn"));
		WebElement clkme = driver.findElement(By.xpath("(//button)[4]"));
		mouse.doubleClick(doubleck).perform();
		mouse.contextClick(rightclk).perform();
		mouse.click(clkme).perform();
		WebElement inter = driver.findElement(By.xpath("//div[contains(text(),'In')]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView()",inter);
		mouse.click(inter).perform();
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView()",drop);
		mouse.click(drop).perform();
		Thread.sleep(1000);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		mouse.dragAndDrop(src, dst).perform();
		TakesScreenshot ss=(TakesScreenshot) driver;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss2.png");
		FileUtils.copyFile(from, to);
		Thread.sleep(2000);
		driver.close();
	}
}
