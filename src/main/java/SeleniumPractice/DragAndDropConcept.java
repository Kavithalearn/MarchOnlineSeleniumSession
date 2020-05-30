package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept 
{

	public static void main(String[] args)
	{
		
		//User actions:
		//1.drag n drop, right click, moveto Element, click and Sendkeys , double click
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.dragAndDrop(sourceEle, targetEle).build().perform();
		
		action.clickAndHold(sourceEle).moveToElement(targetEle).release().perform(); //Composite actions

		//Single action: build.perform
		//Single action:perform
		
		// multiple actions : no----won't work
		//multiple actions:yes--build.perform or .perform
		//always use build.perform irrespective of actions
		
		
	}

}
