package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getNavigate {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\Selenium-software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.navigate().to("https://classic.crmpro.com/");

		WebElement ele = driver.findElement(By.name("username"));
		ele.sendKeys("Mandeep 1");

		driver.navigate().refresh();

		ele = driver.findElement(By.name("username"));

		ele.sendKeys("Mandeep 2");
	}

}
