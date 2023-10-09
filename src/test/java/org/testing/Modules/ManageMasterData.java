package org.testing.Modules;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testing.utilities.RandomNumberGenerator;
import org.testing.utilities.ScreenShotCaptured;

public class ManageMasterData {

	Properties properties;
	WebDriver driver;

	public ManageMasterData(Properties properties, WebDriver driver) {
		this.properties = properties;
		this.driver = driver;
	}

	public void masterDataListing(WebDriver driver) throws IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("MenuSearch"))).click();
			driver.findElement(By.xpath(properties.getProperty("MenuSearchInput"))).sendKeys("master");
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("MenuSearchInput"))).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("MenuSearchItem"))).click();
			Thread.sleep(3000);
			String pageTitle = driver.findElement(By.xpath(properties.getProperty("PageTitle"))).getText();
			if (pageTitle.contains("Manage Master Data")) {
				System.out.println("You are landed on Manage Master Data Listing");
			} else
				System.out.println("Index Page... How did you end up here ?? ");
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void masterDataFilter(WebDriver driver) throws IOException {
		try {
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("FilterPopup"))).click();
			Thread.sleep(1000);
			Select select = new Select(driver.findElement(By.xpath(properties.getProperty("MdStatus"))));
			select.selectByValue("1");
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("ApplyButton"))).click();
			Thread.sleep(2000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void masterDataSearchByValue(WebDriver driver) throws IOException {
		try {
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("ExpendedSearch"))).click();
			driver.findElement(By.xpath(properties.getProperty("SearchByMDValue"))).sendKeys("haryana");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("ClickSearchSuggestion"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CloseMDValuePage"))).click();
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void masterDataSearchByTitle(WebDriver driver) throws IOException {
		try {
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("ExpendedSearch"))).click();
			Thread.sleep(3000);
			Select select = new Select(driver.findElement(By.xpath(properties.getProperty("SearchByMDTitle"))));
			select.selectByValue("parent");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("SearchMDTitle"))).sendKeys("country");
			driver.findElement(By.xpath(properties.getProperty("SearchMDTitle"))).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CountryCode"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CloseMDValuePage"))).click();
			driver.findElement(By.id("searchMasterchildData")).sendKeys("india");
			driver.findElement(By.id("searchMasterchildData")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("closeSearch")).click();
			driver.findElement(By.xpath("india")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CloseMDValuePage"))).click();
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void masterDataTraversing(WebDriver driver) throws IOException {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("CloseMDValuePage"))).click();
			driver.findElement(By.id("searchMasterchildData")).sendKeys("india");
			driver.findElement(By.id("searchMasterchildData")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("closeSearch")).click();
			driver.findElement(By.xpath("india")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("CloseMDValuePage"))).click();
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void showHideMasterDataValueToggle(WebDriver driver) throws IOException {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("ExpendedSearch"))).click();
			driver.findElement(By.xpath(properties.getProperty("SearchByMDValue"))).sendKeys("haryana");
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("ClickSearchSuggestion"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='toggle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='confirmYes']")).click();
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../Nopaperforms.com/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}


}
