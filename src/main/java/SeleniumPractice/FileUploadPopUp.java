package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\kavit\\OneDrive\\Pictures\\fruits.jpg");
		
		//This file upload will only work the form must contain an <input type=file> element.
		
		
		
	}

}
