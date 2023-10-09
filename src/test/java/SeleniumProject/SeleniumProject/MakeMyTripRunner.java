package SeleniumProject.SeleniumProject;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;

public class MakeMyTripRunner {

	
	WebDriver driver;
	Collections collections = new Collections();	
	String webSiteDomain = "https://www.makemytrip.com";
	MakeMyTrip mmt = new MakeMyTrip();
	
	@Test
	public void test1() throws InterruptedException  {	
		
		mmt.makeMyTrip(webSiteDomain, driver);
	
	}
	@BeforeMethod
	public void browserSetup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "../SeleniumProject/chromedriver.exe");
		this.driver = new ChromeDriver();
		System.out.println("Chrom Browser is launch Sussessfully !");

	}

}
