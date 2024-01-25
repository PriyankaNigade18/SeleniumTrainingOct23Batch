package mouseActions;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeAction {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		
		
		//frame
		driver.switchTo().frame(0);
		
		
		WebElement handle=driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(handle).dragAndDropBy(handle, 200, 100).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
