package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{

	public static void main(String[] args) throws InterruptedException
	{
		
		BrowserUtilities br = new BrowserUtilities();
		WebDriver driver = br.init_driver("chrome");
		driver.manage().window().maximize();
		//br.launchurl("https://classic.crmpro.com/");
		
		br.launchurl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		br.navigateTourl("https://classic.crmpro.com/");
		br.navigateBackTourl();
		br.navigateForwardTourl();
		
		String title = br.doGetTitle();
		System.out.println("title is  :" + title);
		
		/*By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By header = By.cssSelector("h1.private-page__title");
		
		
		ElementUtilities elementUtil = new ElementUtilities(driver);
		elementUtil.doSendKeys(emailId, "naveenanimation30@gmail.com");
		elementUtil.doSendKeys(password, "Test@1234");
		
		
		
		
		elementUtil.doClick(loginButton);
		
		Thread.sleep(5000);
		
		String headerText = elementUtil.doGetText(header);
		System.out.println("home page header is  :" + headerText);
		
		
		
		
		br.doQuitBrowser();*/
		
		
		
	}

}
