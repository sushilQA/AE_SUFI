package org.testing.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.RandomNumberGenerator;
import org.testing.utilities.ScreenShotCaptured;

public class Login {
	
	Properties properties;
	WebDriver driver;
	public Login(Properties properties, WebDriver driver)
	{
		this.properties = properties;
		this.driver = driver;
	}
	
	public void backendUerLogIn(String userName , String password) throws IOException
	{
		try {
			driver.findElement(By.xpath(properties.getProperty("Email"))).sendKeys(userName);
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("Password"))).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("SignIn"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CloseTour"))).click();
			if(driver.findElement(By.xpath(properties.getProperty("SessionDestroyed"))).isDisplayed())
			{
				driver.findElement(By.xpath(properties.getProperty("SessionDestroyed"))).click();
				driver.findElement(By.xpath(properties.getProperty("Email"))).sendKeys(userName);
				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("Password"))).sendKeys(password);
				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("SignIn"))).click();
				Thread.sleep(3000);
			}
			
			System.out.println("You have been Sign in Successfully! ");
			Thread.sleep(1000);

			}catch(Exception exception)
			{
				ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"+RandomNumberGenerator.randomNumber()+".png", driver);
				System.out.println("There is an Exception in Code :"+exception);
			}
	}

}
