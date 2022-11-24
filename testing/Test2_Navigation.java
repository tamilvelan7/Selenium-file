package com.selenium.testing;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2_Navigation {
	public static void main(String[] args) throws InterruptedException {
		String link1, link2, link3, link4;
		link1 = "https://www.google.com/";
		link2 = "https://tamilseleniumjava.wordpress.com/2022/08/17/introduction-of-selenium/";
		link3 = "https://tamilseleniumjava.wordpress.com/2022/08/18/installation-and-configure-selenium-in-eclipse/";
		link4 = "https://tamilseleniumjava.wordpress.com/2022/08/18/navigation-in-selenium/";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(link1);
		driver.manage().window().maximize();
		driver.navigate().to(link2);
		Thread.sleep(2000);
		String title = driver.getTitle();
		driver.navigate().back();
		driver.navigate().to(link3);
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		driver.navigate().back();
		driver.navigate().forward();
		driver.get(link4);
		String title2 = driver.getTitle();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(title + "\n" + currentUrl + "\n" + title2);
		driver.close();
	}
}