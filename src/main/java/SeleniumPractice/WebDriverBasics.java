package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\Selenium-software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		
		//System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
		

		//WebDriver driver = new FirefoxDriver();//launch firefox
		driver.get("http://www.facebook.com");//enter url
		
		String title = driver.getTitle();//get title
		System.out.println("page titls is: "+ title);
		
		//verification point - checkpoint
		if(title.equals("Facebook - Log In or Sign Up")){
			
			System.out.println("correct title");
		}else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		driver.close();
		
		
		
	}

}
