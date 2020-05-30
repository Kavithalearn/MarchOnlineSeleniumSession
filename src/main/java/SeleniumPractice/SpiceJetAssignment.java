package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetAssignment {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(8000);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		Thread.sleep(5000);
		
		 WebElement element1 = driver .findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
		 action.moveToElement(element1).build().perform();
		 driver.findElement(By.linkText("Member Login")).click();
		
		
	}

}
