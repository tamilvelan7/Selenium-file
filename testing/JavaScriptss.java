package com.selenium.testing;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\chromedriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        driver.get("https://www.amazon.in/");
//        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[.='✕']")).click();
        jsExecutor.executeScript("document.getElementsByName('field-keywords')[0].value='mobiles'");
//        Thread.sleep(3000);
//      driver.findElement(By.name("q")).sendKeys("Laptop"/*+Keys.ENTER*/);
        WebElement element =driver.findElement(By.xpath("//*[@value='Go']"));
//        Actions mouse=new Actions(driver);
//        mouse.click(element).build().perform();
        jsExecutor.executeScript("arguments[0].click()",element);
//        Thread.sleep(1000);
//        jsExecutor.executeScript("location.reload()");
//        WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'X515')]"));
//        jsExecutor.executeScript("arguments[0].scrollIntoView()", element2);
//        Thread.sleep(2000);
//        jsExecutor.executeScript("window.scrollBy(0,-100)");
//        Thread.sleep(1000);
//        jsExecutor.executeScript("window.scrollBy(0,9000)");
//        Thread.sleep(1000);
//        jsExecutor.executeScript("window.scrollBy(0,-9000)");
//        driver.close();
	}

}
