package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {
	
	
	WebDriver driver;
	
	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * @param browserName
	 * @return driver
	 */
	
	public WebDriver init_driver(String browserName)
	{
		switch(browserName)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
			
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			break;	
			
		default:
			System.out.println(browserName + " browser is not found");
		break;
		}
	
	 return driver;
	}
	
	
	public void launchurl(String url)//generic wrapper
	{
		driver.get(url);
	}
	
	public void navigateTourl(String url)
	{
		driver.navigate().to(url);
	}
	
	public void navigateBackTourl()
	{
		driver.navigate().back();
	}
	public void navigateForwardTourl()
	{
		driver.navigate().forward();
	}
	
	public String doGetTitle()
	{
		return driver.getTitle();
	}
	
	
	public void doQuitBrowser()
	{
		driver.quit();
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
