package com.selenium.testing;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Framess {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Tamilvelan");
        driver.findElement(By.name("lname")).sendKeys("Muthu");
        driver.switchTo().parentFrame();
        JavascriptExecutor jsexe=(JavascriptExecutor) driver;
        jsexe.executeScript("window.scrollBy(0,200)");
        driver.switchTo().frame("firstFr");
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("Selenium@gmail.com");
        Thread.sleep(2000);
        TakesScreenshot ss=(TakesScreenshot) driver;
        File from = ss.getScreenshotAs(OutputType.FILE);
        File to=new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss1.png");
        FileUtils.copyFile(from, to);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Watch tutorial")).click();
	}

}
