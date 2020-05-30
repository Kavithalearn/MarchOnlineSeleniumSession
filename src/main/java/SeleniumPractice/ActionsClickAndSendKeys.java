package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
		
        Thread.sleep(6000);
		
		WebElement userID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(userID, "naveen@gmail.com").build().perform();
		action.sendKeys(password, "naveen@123").build().perform();
		action.click(loginButton).build().perform();	
		
	}

}