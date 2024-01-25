package mouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		
		//button-->right click
		WebElement eleBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Actions class 
		Actions act=new Actions(driver);
		act.contextClick(eleBtn).perform();
		
		
		//menu
		List<WebElement> menu=driver.findElements(By.xpath("(//ul)[3]//li/span"));
		
		for(WebElement i:menu)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Cut"))
			{
				i.click();
				
				break;
			}
		}
		
		Thread.sleep(2000);
		//alert
		
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt1.getText());
		//ok
		alt1.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
