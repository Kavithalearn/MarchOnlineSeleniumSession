package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethods {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtilities elementUtil = new ElementUtilities(driver);
		
		driver.get("https://app.hubspot.com/login");
		
		if(elementUtil.waitForUrl("login",8))
		{
			System.out.println("login is present in url");
		}
		
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		
		elementUtil.waitForElementPresent(username, 10).sendKeys("naveen@gmail.com");
		elementUtil.doSendKeys(password, "Test@123");
		
		elementUtil.waitForElementToBeClickable(loginButton, 5).click();
	}
	

}
