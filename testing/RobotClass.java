package com.selenium.testing;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions mouse=new Actions(driver);
		Robot vk=new Robot();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		
		//"TakesScreenshot" can't handle the alert
		//So we'll move on to full-screen screenshots.  
		//Step-1
		vk.keyPress(KeyEvent.VK_WINDOWS);
		vk.keyPress(KeyEvent.VK_PRINTSCREEN);
		vk.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Step-2
		driver.findElement(By.id("confirm")).click();
		Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle re=new Rectangle(dm);
		BufferedImage bi=vk.createScreenCapture(re);
		File from=new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Screenshot\\ss4.png");
		ImageIO.write(bi, "png", from);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//Search Google for this element
		WebElement element = driver.findElement(By.linkText("Watch tutorial"));
		mouse.contextClick(element).perform();
		for (int i=0;i<=7;i++) {
			vk.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(100);
		}
		vk.keyRelease(KeyEvent.VK_DOWN);
		vk.keyPress(KeyEvent.VK_ENTER);
		vk.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
	}
}
