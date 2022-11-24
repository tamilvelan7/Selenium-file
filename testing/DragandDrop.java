package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[contains(@type,'s')]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'select')]"));
		Select tool=new Select(element);
		tool.selectByIndex(2);
		Thread.sleep(1000);
		
		//WebElement selectedOption = tool.getFirstSelectedOption();
//		Thread.sleep(2000);
//		WebElement element1 = driver.findElement(By.xpath("(//select)[5]"));
//		Select tool1=new Select(element1);
//		tool1.selectByIndex(1);
//		WebElement selectedOption1 = tool1.getFirstSelectedOption();
//		WebElement element2 = driver.findElement(By.xpath("//select[contains(@name,'city')]"));
//		Select tool2=new Select(element2);
//		tool2.selectByVisibleText("Chennai");
//		WebElement wrappedElement = tool2.getWrappedElement();
//		System.out.println(wrappedElement);
		
	
	}
}
