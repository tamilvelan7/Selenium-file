package com.selenium.testing;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dragdown {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement element = driver.findElement(By.xpath("//select[1]"));
		Select tool = new Select(element);
		tool.selectByIndex(1);
		WebElement SelectedOption = tool.getFirstSelectedOption();
	
		WebElement element1 = driver.findElement(By.id("superheros"));
		Select tool1 = new Select(element1);
		tool1.selectByIndex(3);
		tool1.selectByIndex(7);
		tool1.selectByIndex(10);
		tool1.selectByIndex(17);
		List<WebElement> SelectedOptions1 = tool1.getAllSelectedOptions();
		
		WebElement element2 = driver.findElement(By.xpath("//select[contains(@id,'l')]"));
		Select tool2 = new Select(element2);
		tool2.selectByVisibleText("Python");
		List<WebElement> options = tool2.getOptions();
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='country']"));
		Select tool3 = new Select(element3);
		tool3.selectByValue("India");
		WebElement element4 = tool3.getWrappedElement();
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File from = shot.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss1.png");
		//FileUtils.copyFile(from, to);
		//FileHandler.
		System.out.println(SelectedOption.getText());
		System.out.println("***********");
		for (int i = 0; i <= SelectedOptions1.size() - 1; i++) {
			System.out.println(SelectedOptions1.get(i).getText());
		}
		System.out.println("***********");
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());

		}
		System.out.println("***********");
		System.out.println(element4.getText());
		// driver.close();
	}

}
