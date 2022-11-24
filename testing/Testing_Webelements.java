package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing_Webelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/login");
		String title = driver.getTitle();
		WebElement username = driver.findElement(By.name("login"));
		username.sendKeys("Githubuser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Github@123");
		System.out.println(title);
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.name("commit"));
		login.click();
		Thread.sleep(1000);
		WebElement user2 = driver.findElement(By.name("login"));
		user2.clear();
	}
}
