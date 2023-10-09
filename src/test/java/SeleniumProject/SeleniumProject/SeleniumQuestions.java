package SeleniumProject.SeleniumProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQuestions {
	
	

	/*
	 * What is Selenium and what are its advantages? What are the different
	 * components of Selenium? What are the types of locators used in Selenium? What
	 * is the difference between findElement() and findElements() methods in
	 * Selenium? How do you handle frames in Selenium? How do you handle alerts in
	 * Selenium? How do you perform mouse hover actions in Selenium? How do you
	 * handle multiple windows in Selenium? How do you handle synchronization issues
	 * in Selenium? What is TestNG and what are its advantages? How do you
	 * parameterize tests in TestNG? What is a data-driven framework in Selenium?
	 * What are the different types of waits available in Selenium? How do you
	 * handle dropdowns in Selenium? How do you handle checkboxes and radio buttons
	 * in Selenium? What is Page Object Model (POM) and how do you implement it in
	 * Selenium? How do you handle SSL certificates in Selenium? How do you generate
	 * reports in Selenium? How do you run tests on multiple browsers in Selenium?
	 * How do you handle browser cookies in Selenium?
	 */
	WebDriver driver;
	NopaperformsLMPage lmPage = new NopaperformsLMPage(driver);

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		this.driver = new ChromeDriver(options);
		options.addArguments("--disable-notification");
	//  driver.navigate().to("https://www.google.com");
    //  Load the web page with the iframe
        driver.navigate().to("https://www.nopaperforms.com/education-crm/lead-management-system/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
// Take Screen Shots
	public static void takeScreenShot(String path, WebDriver driver) throws IOException {

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File SourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File(path));

	}

//  Add cookies
	@Test(enabled = false)
	public void screenShot() throws InterruptedException, IOException {

		ScreenShotCaptured.takeScreenShot(
				"../Interview/test-output/ScreenShots/" + RandomNumberGenerator.randomNumber() + ".png", driver);
	}

	@Test(enabled = false, priority = 1)
	public void handleBrowserCookies() throws InterruptedException, IOException {
		// create a new cookie
		Cookie cookie = new Cookie("my_cookie", "1234567890");
		// add the cookie to the driver
		driver.manage().addCookie(cookie);
		// retrieve and print the cookies
		System.out.println(driver.manage().getCookieNamed("my_cookie"));
		/*
		 * Set<Cookie> cookies = driver.manage().getCookies(); for(Cookie ck : cookies)
		 * { System.out.println(ck.getName() + "\n And value is " + ck.getValue() +
		 * "\n And domain is " + ck.getDomain() + "\n And class is " + ck.getClass() +
		 * "\n And path is " + ck.getPath() + "\n And expire is " + ck.getExpiry()); }
		 */
	}

//	How do you generate reports in Selenium?

	@Test(enabled = false, priority = 2)
	public void TestReports() throws InterruptedException, IOException {

		ExtentReports extentReports = new ExtentReports("../Interview/test-output/output.html", false);
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("test-report.html");
		ExtentTest extentTest = extentReports.startTest("Browser launch");
		extentReports.endTest(extentTest);
		extentReports.flush();
	}
	
//How do you handle frames in Selenium?
	
	@Test(enabled = false)
	public void handleIframe()
	{

        // Switch to the iframe
        WebElement iframe = driver.findElement(By.className("css-1m4vocp"));
        driver.switchTo().frame(iframe);
        // Interact with elements inside the iframe
        WebElement inputField = driver.findElement(By.id("input-field"));
        inputField.sendKeys("Hello, world!");

        // Switch back to the default content
        driver.switchTo().defaultContent();

	}
	
// How do you handle SSL certificates in Selenium? 
	@Test(enabled=false)
	public static void handleSSLCertificates(String[] args) {
        // Set desired capabilities
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("acceptInsecureCerts", true);

        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
     //   options.merge(capabilities);

        // Set the path of the Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a Chrome driver instance with the desired capabilities
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website with SSL certificate
        driver.get("https://example.com");

        // Close the browser
        driver.quit();
    }
	
	@Test(enabled = false)
    public static void playList() {
        // Create an ArrayList to store the playlist
        ArrayList<String> playlist = new ArrayList<>(3); // initial capacity of 3

        // Add songs to the playlist
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");

        // Play the first 3 songs in the playlist
        System.out.println("Playing the first 3 songs:");
        for (int i = 0; i < playlist.size(); i++) {
            String song = playlist.get(i);
            System.out.println(song);
        }

        // Add a new song to the playlist
        playlist.add("Song 4");

        // Play all the songs in the playlist
        System.out.println("Playing all songs:");
        for (int i = 0; i < playlist.size(); i++) {
            String song = playlist.get(i);
            System.out.println(song);
        }
    }
	
	
//	What is Page Object Model (POM) and how do you implement it in Selenium? 
	@Test(enabled = false)
	public void pageObjectModel()
	{
		lmPage.click();
		
	}




	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
