package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElementsExplicitWait {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtilities elementUtil = new ElementUtilities(driver);

		driver.get("https://www.freshworks.com/");

		By footerLinksList = By.cssSelector("ul.footer-nav li");
		
		List<WebElement> FooterList = elementUtil.visibilityofAllElements(footerLinksList, 5);
		System.out.println(FooterList.size());
		
		for(int i=0; i<FooterList.size(); i++){
			System.out.println(FooterList.get(i).getText());
		}
	}

}
