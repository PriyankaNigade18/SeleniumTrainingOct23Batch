package newAutomationScenraio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarHandling {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//expected date
		String date="6";
		String month="Apr";
		String year="2024";
		
		//open calendar
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		
		//month selection
		while(true)
		{
		String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		System.out.println(text);
		String cmon=text.split(" ")[0];
		String cyer=text.split(" ")[1];
		
		//System.out.println(cmon);
		//System.out.println(cyer);
		if(cmon.contains(month) && cyer.contains(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		
		
		}
		
		
		//date selection
		
		////div[contains(@class,'DayTilesWrapper')]//div[contains(@class,'DayTiles__CalendarDays')]
		
		List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'DayTiles__CalendarDays')]"));
		
		for(WebElement i:allDates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
				
		
		

	}

}
