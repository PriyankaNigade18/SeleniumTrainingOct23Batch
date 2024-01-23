package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchScenario {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("testng");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		for(WebElement i:list)
		{
			System.out.println(i.getText());//inner html text
		}

	}

}