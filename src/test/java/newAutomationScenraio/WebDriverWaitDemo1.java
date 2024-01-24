package newAutomationScenraio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo1 {

	
	public static WebElement waitForPresenceEle(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));	
		
	}
	
	public static WebElement waitForVisibilityEle(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));	
		
	}
	
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));	
		
	}
	
	public static boolean waitForTitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.titleContains(title));	
		
	}
	
	public static boolean waitForUrl(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.urlContains(url));	
		
	}
	
	
	
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//element
		By email=By.id("input-email");
		
		By pasw=By.id("input-password");
		
		By btn=By.xpath("//input[@value='Login']");
		
		
		//WebElement ele=driver.findElement(email);
		/*
		 * .TimeoutException: Expected condition failed:
		 *  waiting for presence of element located by:
		 *   By.id: input-email### 
		 * (tried for 5 second(s) with 500 milliseconds interval)
		 * 
		 * Selenium default time out is 500millisecond  0.5 sec
		 * interval time =Polling time
		 * 
		 * 
		 */
		
		//email
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
		
		//psw
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pasw)).sendKeys("test123");
		
		
		
		
		
		
	}

}
