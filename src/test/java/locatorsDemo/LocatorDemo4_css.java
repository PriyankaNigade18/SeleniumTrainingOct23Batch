package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_css {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//username-tagname with id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//password-tagname with attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
		//login- tagname with classname
		//driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		

		//tagname with class and attribute
		driver.findElement(By.cssSelector("input.btn_action[value='Login']")).click();
		
	}

}
