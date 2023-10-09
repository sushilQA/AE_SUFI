package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {

	public void facebookSignUpPage(String webSiteDomain, WebDriver driver)
			throws InterruptedException {
		driver.navigate().to(webSiteDomain);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
	}
	
	public void facebookBasicDetails(WebDriver driver)
	{
		driver.findElement(By.name("firstname")).sendKeys("SUSHIL");
		driver.findElement(By.name("lastname")).sendKeys("AGRAWAL");
		driver.findElement(By.name("reg_email__")).sendKeys("sushil123@yopmail.com");
		driver.findElement(By.xpath("//input[@type='text' and @*=\"Re-enter email address\"]")).sendKeys("sushil123@yopmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
	}
	
	public void birthDaySelectByVisibleText(WebDriver driver,String visibleText)
	{
		WebElement birthday_day = driver.findElement(By.name("birthday_day"));
		Select selectDay = new Select(birthday_day);
		selectDay.selectByVisibleText(visibleText);
	}
	public void birthMonthSelectByIndex(WebDriver driver,int index)
	{
		WebElement birthday_month = driver.findElement(By.name("birthday_month"));
		Select selectMonth = new Select(birthday_month);
		selectMonth.selectByIndex(index);
	}
	public void birthYearByVisibleText(WebDriver driver,String value)
	{
		WebElement birthday_year = driver.findElement(By.name("birthday_year"));
		Select selectYear = new Select(birthday_year);
		selectYear.selectByValue("1990");
	}
	
	public void signUp(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up' and @name=\"websubmit\"]")).click();
		Thread.sleep(10000);
		Thread.sleep(10000);
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'You have entered an invalid email')]"));
		if (element.getText().contains("You have entered an invalid email")) {
			System.out.println("please try again with a valid email id");
		} else {
			System.out.println("Welcome to facebook");
		}
	}

}
