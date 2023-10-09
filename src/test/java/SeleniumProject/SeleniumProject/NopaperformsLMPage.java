package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NopaperformsLMPage {
	
	private WebDriver driver;
	
	
	@FindBy(xpath = "//*[text()='Schedule a Demo']")
	private WebElement scheduleDemo;
	
	public NopaperformsLMPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		scheduleDemo.click();
	}

}
