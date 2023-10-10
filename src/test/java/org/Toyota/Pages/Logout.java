package org.Toyota.Pages;

import java.io.IOException;
import java.util.Properties;

import org.Toyota.Utilities.RandomNumberGenerator;
import org.Toyota.Utilities.ScreenShotCaptured;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	
	Properties properties;
	WebDriver driver;
	
	public Logout(Properties properties,WebDriver driver)
	{
		this.properties = properties;
		this.driver = driver;
	}
	
	public void backendUserLogOut(WebDriver driver) throws IOException
	{
		try {

			driver.findElement(By.xpath(properties.getProperty("UserPopup"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("SignOut"))).click();
			System.out.println("You have been Sign out Successfully! ");
			}catch(Exception exception)
			{
				ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"+RandomNumberGenerator.randomNumber()+".png", driver);
				System.out.println("There is an Exception in Code :"+exception);
			}
		}
	}


