package org.testing.Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties properties;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		this.driver = new ChromeDriver(options);
		options.addArguments("--disable-notification");
		this.properties = LoadPropertiesFile.handlePropertyFile("../Nopaperforms.com/ObjectRepositery.properties");
		driver.navigate().to("https://login.nopaperforms.io");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
