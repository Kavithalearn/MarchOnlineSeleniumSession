package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://classic.freecrm.com/");
		
		
		Thread.sleep(5000);
		
		String userName = "batchautomation";
		String password = "Test@12345";
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		
		System.out.println(frameCount);
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		String text = driver.findElement(By.xpath("//a[@title='Companies']")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
	}

}
