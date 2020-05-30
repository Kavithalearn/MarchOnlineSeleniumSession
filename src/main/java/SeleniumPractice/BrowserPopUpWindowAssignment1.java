package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopUpWindowAssignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println(handlesList.size());
		
		String parentWindowID = handlesList.get(0);
		String childWindowID = handlesList.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		System.out.println(driver.getTitle());
		
		handles = driver.getWindowHandles();
		handlesList = new ArrayList<String>(handles);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.linkText("Good PopUp #3")).click();
		
		//driver.findElement(By.linkText("Good PopUp #4")).click();
		for(int i=0; i<linksList.size();i++)
		{
			/*String windowID = handlesList.get(i);
			if(i==0)
			{
				parentWindowID =windowID;
			}
			else
			{
				driver.findElement(By.linkText("Good PopUp #"+i)).click();
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
			String text = linksList.get(i).getText();
			System.out.println("text: " + text);
			if(text!=null&&text.trim().length()>0)
			{
			//driver.findElement(By.linkText(text)).click();
			linksList.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			driver.switchTo().window(nameOrHandle)
			}
		}*/ 
	}

}
