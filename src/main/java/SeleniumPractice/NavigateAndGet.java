package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\Selenium-software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().to("http://www.rediff.com");
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().forward();

		driver.navigate().refresh();
		
	}

}
