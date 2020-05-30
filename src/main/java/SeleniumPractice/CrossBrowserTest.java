package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowserTest {

	public static void main(String[] args) 
	{
		String browser = "safari";
		WebDriver driver = null;

		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\software\\Selenium-software\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();//launch chrome
			
		} /*else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}*/

		driver.get("http://www.facebook.com");// enter url

		String title = driver.getTitle();// get title
		System.out.println("page titls is: " + title);

		// verification point - checkpoint
		if (title.equals("Facebook – log in or sign up")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		// driver.quit();//close the browser
		driver.close();
	}

}
