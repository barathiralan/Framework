package org.sample;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userLab.UtilityBaseClass;

public class Demo extends UtilityBaseClass {
	public static void main(String[] args) throws AWTException {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		browserMaximize();
		WebElement username = driver.findElement(By.id("email"));
		fillValue(username, "Greens");
		doubleClickBtn(username);
		rightClick(username);
		for (int i = 0; i <3; i++) {
			downBtn();
			}
		enterBtn();
		tabBtn();
		pasteBtn();
		
		
	}

}
