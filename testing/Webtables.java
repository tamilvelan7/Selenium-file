package com.selenium.testing;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://letcode.in/table");
		WebElement table1 = driver.findElement(By.id("shopping"));
		WebElement table2 = driver.findElement(By.id("simpletable"));
		WebElement table3 = driver.findElement(By.xpath("(//table)[3]"));
//		List<WebElement> list1 = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[1]"));
		List<WebElement> list2 = table1.findElements(By.xpath("(//table)[1]/tbody/tr/td[2]"));
		List<Integer> total=new LinkedList();
		for (WebElement webElement : list2) {
			String text = webElement.getText();
			int value = Integer.parseInt(text);
			total.add(value);
		}
		int sum=0;
		for (Integer integer : total) {
			sum=sum+integer;
		}
		System.out.println("Total Price= "+sum+"\n"+"----------");
//		table2.findElement(By.xpath(""))
		

	}
}