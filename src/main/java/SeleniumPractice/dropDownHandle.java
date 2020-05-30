package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownHandle
{
	public static void main(String[] args)
	{
		//Select class to handle the dropdowns if Select html is there
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		//Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Option 2");
		//select.selectByIndex(1); //where the drop down value is always constant then we can use this method ex: DOB,Month
		//select.selectByValue("2");
		//doSelectByVisibleText(dropdown,"option 2");
		doSelectByIndex(dropdown,1);
		doSelectByValue(dropdown,"2");
		
	}
	
	public static void doSelectByVisibleText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void doSelectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
}
