package org.Toyota.Pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.Toyota.Utilities.RandomNumberGenerator;
import org.Toyota.Utilities.ScreenShotCaptured;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyRequest {

	Properties properties;
	WebDriver driver;

	public MyRequest(Properties properties, WebDriver driver) {
		this.properties = properties;
		this.driver = driver;
	}

	public void myRequest(WebDriver driver, Properties properties) throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Menue"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("MenuSearch"))).sendKeys("request");
			driver.findElement(By.xpath(properties.getProperty("MyRequest"))).click();;			
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../AE_Toyota/src/test/java/org/Toyota/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

}
