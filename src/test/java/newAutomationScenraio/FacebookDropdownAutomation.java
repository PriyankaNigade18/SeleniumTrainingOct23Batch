package newAutomationScenraio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownAutomation 
{
	//reusable method
	public static void selectBasedDropdown(WebElement dele,String value)
	{
		Select dd=new Select(dele);
		System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		
		List<WebElement> allopt=dd.getOptions();
		System.out.println("Total options are: "+allopt.size());
		
		
		for(WebElement i:allopt)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	
		
		//create an account
		driver.findElement(By.linkText("Create new account")).click();
		
		//get the dropdown day
		
		WebElement dayele=driver.findElement(By.id("day"));
		selectBasedDropdown(dayele,"27");
		
		
		//month dropdown
		WebElement monthele=driver.findElement(By.id("month"));
		selectBasedDropdown(monthele,"Dec");
	
		//year
			WebElement yearele=driver.findElement(By.id("year"));
			selectBasedDropdown(yearele,"2010");
	
	
	
	
	
	
	
		
//		Select daydd=new Select(dayele);
//		System.out.println("Is dropdown support multiple selection?: "+daydd.isMultiple());
//		
//		List<WebElement> allOptions=daydd.getOptions();
//		System.out.println("Total options are: "+allOptions.size());
//		
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("27"))
//			{
//				i.click();
//				break;
//			}
//			
//		}
//		
		
		
//		Select monthdd=new Select(monthele);
//		System.out.println("Is dropdown support multiple selection?: "+monthdd.isMultiple());
//		
//		List<WebElement> allopt=monthdd.getOptions();
//		System.out.println("Total options are: "+allopt.size());
//		
//		
//		for(WebElement i:allopt)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("Dec"))
//			{
//				i.click();
//				break;
//			}
//			
//		}
		
		
		
		
		
		
		
	}

}
