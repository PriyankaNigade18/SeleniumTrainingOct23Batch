package newAutomationScenraio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedDropdownDemo1_Amazon {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		
		//dropdown address
		WebElement dele=driver.findElement(By.name("url"));
		
		//select class
		Select sc=new Select(dele);
		
		System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		
		
		//single options
		sc.selectByIndex(3);
		Thread.sleep(2000);
		sc.selectByValue("search-alias=gift-cards");
		Thread.sleep(2000);
		sc.selectByVisibleText("Books");
		
		//To get all options?To get text of options
		List<WebElement> allOptions=sc.getOptions();
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Toys & Games"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
