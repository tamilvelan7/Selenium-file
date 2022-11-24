package com.selenium.testing;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Window_Handle {
	
	public void downkey() throws AWTException {
		Robot key=new Robot();
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
	}
//	public void screenshot() throws AWTException{
//		Robot key=new Robot();
//		key.keyPress(KeyEvent.VK_WINDOWS);
// 		key.keyPress(KeyEvent.VK_PRINTSCREEN);
// 		key.keyRelease(KeyEvent.VK_WINDOWS);
//	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Selenium Testing\\Firefoxdriver\\geckodriver.exe");
		Window_Handle method=new Window_Handle();
		WebDriver driver=new FirefoxDriver();
		Actions mouse=new Actions(driver);
		Robot key=new Robot();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		String parent = driver.getWindowHandle();
		
		List<String> xpaths=new ArrayList();
		xpaths.add("//div[text()='Top Offers']");
		xpaths.add("//div[text()='Grocery']");
		xpaths.add("//div[text()='Mobiles']");

		for (String xpath : xpaths) {
			WebElement offer = driver.findElement(By.xpath(xpath));
			mouse.contextClick(offer).perform();
			method.downkey(); //method calling using Robot class
		}
		Set<String> all_Tabs = driver.getWindowHandles();
//		All Title of the webpage
 		for (String tab : all_Tabs) {
			String title = driver.switchTo().window(tab).getTitle();
			System.out.println(title);
			Thread.sleep(1000);
		}
// 		First move to parent window 
 		driver.switchTo().window(parent);
 		Thread.sleep(2000);
// 		Move to the particular Tab
 		for (String tab : all_Tabs) {
			String title = driver.switchTo().window(tab).getTitle();
			if(title.contains("Mobile Phones")) {
				break;
			}
		}
 		key.keyPress(KeyEvent.VK_WINDOWS);
		key.keyPress(KeyEvent.VK_PRINTSCREEN);
		key.keyRelease(KeyEvent.VK_WINDOWS);
	}
}
