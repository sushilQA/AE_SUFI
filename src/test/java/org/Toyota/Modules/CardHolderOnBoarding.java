package org.Toyota.Modules;

import java.io.IOException;
import java.util.Properties;

import org.Toyota.Pages.MyRequest;
import org.Toyota.Utilities.RandomNumberGenerator;
import org.Toyota.Utilities.ScreenShotCaptured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardHolderOnBoarding {
	
	Properties properties;
	WebDriver driver;
	MyRequest myRequest = new MyRequest(properties, driver);
	
	public CardHolderOnBoarding(Properties properties, WebDriver driver)
	{
		this.properties = properties;
		this.driver = driver;
	}
	
	public void cardHolderOnBoarding(String userName , String password) throws IOException
	{
		try {
			myRequest.myRequest(driver, properties);

			}catch(Exception exception)
			{
				ScreenShotCaptured.takeScreenShot("../AE_Toyota/src/test/java/org/testing/ScreenShots/"+RandomNumberGenerator.randomNumber()+".png", driver);
				System.out.println("There is an Exception in Code :"+exception);
			}
	}

}
