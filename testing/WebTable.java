package com.selenium.testing;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter location: ");
		String natives = input.nextLine();
		driver.get("https://www.timeanddate.com/weather/india");
		WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		List<WebElement> allloc = table.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (int i = 0; i < allloc.size(); i++) {
			if(allloc.get(i).getText().contains(natives)) {
				System.out.println("Current Weather in India: ");
				for (int j = i; j <=i+3; j++) {
					String text = allloc.get(j).getText();
					System.out.print(text+" ");
				}
				break;
			}
		}
	}

}
