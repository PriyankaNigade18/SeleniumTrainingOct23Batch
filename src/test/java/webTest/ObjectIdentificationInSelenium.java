package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationInSelenium {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		/*
		 * Technique 3: Identify + Action
		 * 
		 */
		driver.findElement(By.id("APjFqb")).sendKeys("selenium",Keys.ENTER);
		
		
		
		/*
		 * Technique 2: Identify+validation and Action
		 * 
		 
		
		WebElement ele1=driver.findElement(By.id("APjFqb"));
		
			if(ele1.isDisplayed() && ele1.isEnabled())
			{
				ele1.sendKeys("TestNG",Keys.ENTER);
			}
		*/
		
		/*
		 * Technique 1: By locator (Identify+validation+Actions)
		 
		
		//to get the address of search box
		By searchaddress=By.id("APjFqb");
		
		//identify using selenium method
		WebElement searchEle=driver.findElement(searchaddress);
		
		//validate WebElement
		System.out.println("Is Searchbox is display:"+searchEle.isDisplayed());
		System.out.println("Is Searchbox enabled? "+searchEle.isEnabled());
		//perform action
		searchEle.sendKeys("java",Keys.ENTER);
		*/
		
		
		
		
		
		
		
		

	}

}
