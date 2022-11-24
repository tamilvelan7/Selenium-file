package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("9876543210");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title+"\n"+url);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamilvelan");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Tamilvelan m");
		driver.findElement(By.xpath("//input[contains(@type,'p')]")).sendKeys("Insta@123");
		driver.findElement(By.xpath("//button[contains(text(),'S')]")).click();
		Thread.sleep(2000);
		//driver.close();
	}
}
