package newAutomationScenraio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTest {

	public static void main(String[] args) throws InterruptedException
	{
		
		//headless mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Driver session is created!");
		driver.get("https://www.google.com");
		System.out.println("Application open!");
		
		System.out.println("Title is: "+driver.getTitle());
		
		System.out.println("Before search : "+driver.getCurrentUrl());
		//search box
		driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
		
		System.out.println("After search : "+driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		driver.quit();
		System.out.println("Browser closed!");

	}

}
