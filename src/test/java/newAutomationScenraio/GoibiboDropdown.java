package newAutomationScenraio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboDropdown {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		
		//close the popup
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			
		
		//from
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		//input
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		
		
		List<WebElement> fList=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(@class,'fsjMhJ')]"));
		System.out.println("Total OPtions are: "+fList.size());
		
		for(WebElement i:fList)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pantnagar"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
