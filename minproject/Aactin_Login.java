package com.selenium.minproject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aactin_Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver aactin = new FirefoxDriver();
		aactin.get("http://adactinhotelapp.com/index.php");
		aactin.findElement(By.id("username")).sendKeys("TamilvelanM");
		aactin.findElement(By.id("password")).sendKeys("Tamil@123");
		aactin.findElement(By.id("login")).click();
		Map<String, Integer> ind_ids = new HashMap();
		ind_ids.put("location", 8);
		ind_ids.put("hotels", 2);
		ind_ids.put("room_type", 4);
		ind_ids.put("room_nos", 3);
		ind_ids.put("adult_room", 3);
		ind_ids.put("child_room", 2);
		for (Map.Entry mp : ind_ids.entrySet()) {
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
			WebElement element = aactin.findElement(By.id((String) mp.getKey()));
			Select loc = new Select(element);
			loc.selectByIndex((int) mp.getValue());
		}
		WebElement findElement = aactin.findElement(By.id("datepick_in"));
		findElement.clear();
		findElement.sendKeys("26/08/2022");
		WebElement findElement1 = aactin.findElement(By.id("datepick_out"));
		findElement1.clear();
		findElement1.sendKeys("29/08/2022");
		aactin.findElement(By.xpath("//input[@name='Submit']")).click();
		aactin.findElement(By.id("radiobutton_0")).click();
		aactin.findElement(By.id("continue")).click();
		aactin.findElement(By.name("first_name")).sendKeys("Tamilvelan");
		aactin.findElement(By.id("last_name")).sendKeys("M");
		aactin.findElement(By.id("address")).sendKeys("No.33, Ranganadhan Street,\nPallavaram\nChennai-43");
		aactin.findElement(By.id("cc_num")).sendKeys("8493657482937485");
		aactin.findElement(By.id("cc_cvv")).sendKeys("342");
		WebElement element = aactin.findElement(By.xpath("//select[@name='cc_type']"));
		WebElement element1 = aactin.findElement(By.xpath("//select[@id='cc_exp_month']"));
		WebElement element2 = aactin.findElement(By.xpath("(//select)[3]"));
		Select loc = new Select(element);
		Select loc1 = new Select(element1);
		Select loc2 = new Select(element2);
		loc.selectByIndex(3);
		loc1.selectByValue("12");
		loc2.selectByVisibleText("2022");
		aactin.findElement(By.id("book_now")).click();
		Thread.sleep(7000);
		aactin.findElement(By.id("my_itinerary")).click();
		TakesScreenshot ss=(TakesScreenshot)aactin;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss.png");
		FileUtils.copyFile(from, to);
		Thread.sleep(2000);
		System.out.println("Hotel reservation has been confirmed.");
		aactin.close();
	}
}
