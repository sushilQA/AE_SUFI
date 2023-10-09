package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public void makeMyTrip(String webSiteDomain, WebDriver driver) throws InterruptedException {

		try {
		Actions action = new Actions(driver);
		driver.navigate().to(webSiteDomain);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement langCard = driver.findElement(By.xpath("//*[@class=\"langCardClose\"]"));
		langCard.click();
		System.out.println("LangCard handeled successfully");
		Thread.sleep(1000);
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		action.click().sendKeys(fromCity, Keys.ENTER).build().perform();
		System.out.println("Click performed in From City");
		Thread.sleep(3000);
		WebElement source = driver.findElement(
				By.xpath("//*[@class='font14 appendBottom5 blackText' and text()='Abu Dhabi, United Arab Emirates']"));
		action.sendKeys(source, Keys.ENTER).perform();
		System.out.println("Source has been entered in From City");
		Thread.sleep(3000);

		WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		action.click().sendKeys(toCity, Keys.ENTER).build().perform();
		System.out.println("Click performed in To City");
		Thread.sleep(3000);
		WebElement destination = driver.findElement(
				By.xpath("//*[@class='font14 appendBottom5 blackText' and text()='Singapore, Singapore']"));
		action.sendKeys(destination, Keys.ENTER).perform();
		System.out.println("Destination has been entered in To City");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ' and text()='Search']"))
				.click();
		}catch(Exception exception)
		{
			System.out.println(exception);
		}
	}

}
