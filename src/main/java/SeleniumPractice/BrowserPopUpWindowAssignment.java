package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopUpWindowAssignment {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		driver.findElement(By.linkText("Good PopUp #4")).click();

		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println(handlesList.size());
		
		String parentWindowID = null;
		
		for(int i=0; i<handlesList.size();i++)
		{
			String windowID = handlesList.get(i);
			if(i==0)
			{
				parentWindowID =windowID;
			}
			else
			{
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		} 
		
		  driver.switchTo().window(parentWindowID);
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl()); driver.quit();
	}
}

			 /* String parentWindowID = handlesList.get(0); String childWindowID1 =
			 handlesList.get(1); String childWindowID2 = handlesList.get(2);
			  
			  driver.switchTo().window(childWindowID1);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl()); driver.close();
			  
			  driver.switchTo().window(childWindowID2);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl()); driver.close();*/
		 
	


