package org.userLab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}

	public static void fillValue(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void doubleClickBtn(WebElement e) {
		a=new Actions(driver);
		a.doubleClick(e).perform();;

	}
	public static void rightClick(WebElement e) {
		a=new Actions(driver);
		a.contextClick(e).perform();;

	}
	public static void downBtn() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

	}
	public static void enterBtn() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static  void tabBtn() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	

	}
	public static void pasteBtn() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
