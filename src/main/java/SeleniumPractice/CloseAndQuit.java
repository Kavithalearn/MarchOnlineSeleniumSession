package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\Selenium-software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();// get title
		System.out.println("page titls is: " + title); // Google

		driver.close();

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
