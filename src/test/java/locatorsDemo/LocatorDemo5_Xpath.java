package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_Xpath {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.xpath("//a[@id='SignIn']")).click();
		
		//login -emailid
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		//login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//logout
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		

	}

}
