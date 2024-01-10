package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.linkText("Sign In")).click();
		
		//driver.findElement(By.partialLinkText("In")).click();
		//NoSuchElementException
		//driver.findElement(By.partialLinkText("selenium")).click();
		
		//login page
		
		//email-->id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password-->name
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//check box--->id
		driver.findElement(By.id("remember")).click();
			/*
			 * InvalidSelectorException: Compound class names not permitted
			 * class="btn     btn-default  btn-primary"
			 *        class1    class2      class3
			 */
		//submit--->className
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn")).click();
		
		
		//logout
		driver.findElement(By.linkText("Sign Out")).click();
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//close
		driver.quit();
		
		
		
		
		

	}

}
