package newAutomationScenraio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBudDropDown {

	public static void main(String[] args)
	{
		//disable notifications
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		//create driver session
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		
		//drop down
		driver.findElement(By.id("src")).sendKeys("pune");
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'sc-dnq')]//li//text[@class='placeHolderMainText']"));
		System.out.println("Total options are: "+options.size());
		
		
		for(WebElement i:options)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Viman Nagar"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		

	}

}
