package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();//set is not an order based collections
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		
		System.out.println("parent window id :" +parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("child window id :" +childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is :" + driver.getTitle());
		
		driver.close();// close the pop up window
		
		driver.switchTo().window(parentWindowID);

		System.out.println("Parent window title is :" + driver.getTitle());
		
		driver.quit();
		

		
		

		
		
	}

}
