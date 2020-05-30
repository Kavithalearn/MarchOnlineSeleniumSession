package SeleniumPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println(imagesList.size());
		
		for(int i=0; i<imagesList.size();i++)
		{
			String text = imagesList.get(i).getText();
			
			if(!text.isEmpty())
			{
				System.out.println(i+ "-->"+ text.trim());
				System.out.println(imagesList.get(i).getAttribute("src"));
			}
		}

	}

}
