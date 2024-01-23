package newAutomationScenraio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo1 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		//frame with indexing
		//driver.switchTo().frame(0);
		
		//frame with id/name
		//driver.switchTo().frame("mce_0_ifr");
		
		
		//frame with webElement
		WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
		
		driver.switchTo().frame(frameEle);
		
		//WebElement
		WebElement ele=driver.findElement(By.id("tinymce"));
		Thread.sleep(1500);
		ele.clear();
		Thread.sleep(1500);
		ele.sendKeys("Hello All!");
		
		
		
		
		
		
		
		
		
		

	}

}
