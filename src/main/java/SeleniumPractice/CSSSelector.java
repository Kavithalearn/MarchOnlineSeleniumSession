package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
		//Custom CSS:		
		
		//Custom CSS:
				//id --> #id or htmltag#id
				//class --> .classname or htmltag.classname
		//#username
		//input#username
		
		//.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email
		// .c1.c2.c3...cn
		//.c1
		// .login-email
		// input.login-email
		//input.login-email#username
		//input#username.login-email
		//input.form-control.private-form__control.login-email#username
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen");
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("naveen");
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("naveen");
		
		//htmltag[@prop='value']
		// htmltag[prop='value']
				
		// //input[@id='username']
		// input[id='username']
		
		//input[@id='username' and @type='email']
		// input[id='username'][type='email']
		// input[id='username'][type='email'][tabindex='1']
		// input[id][type][tabindex]
		// input[type='email']
		
		// div.private-form__input-wrapper > input#username
		// div > input#username
		// div input#username
		//ul.nav navbar-nav navbar-right> li>a
		//ul.nav navbar-nav navbar-right li a
		
		// ul.nav.navbar-nav.navbar-right li a
		// ul.nav.navbar-nav.navbar-right > li > a
				
		// ul.footer-nav li
		
		// input[id*= 'user'] -- contains
		// input[id^= 'user'] -- starts with
		// input[id$= 'name'] -- ends with
		
		
		//comma in css:
				// input#username, input#password, button#loginBtn
				List<WebElement> list = driver.findElements(By.cssSelector("input.login-email, input#password, button#loginBtn"));
				System.out.println(list.size());
				if(list.size() == 3){
					System.out.println("my login form is displayed with all the elements....");
				}
				
				//nth-of-type:
				// ul.nav.navbar-nav.navbar-right li:nth-of-type(1)  -- 1st element
				// ul.nav.navbar-nav.navbar-right li:nth-of-type(n) -- all elements
				 
				// ul li:nth-of-type(10)
				
				//following sibling in css:
				// div.private-form__input-wrapper + div
				
				//not operator in CSS:
				// form-control private-form__control login-email
				// form-control private-form__control login-password m-bottom-3
				
				// input.form-control.private-form__control:not(.login-password)
				// input.form-control.private-form__control:not(#username)
				
	}

}
