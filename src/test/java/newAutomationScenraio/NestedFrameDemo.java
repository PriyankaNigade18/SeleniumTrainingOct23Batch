package newAutomationScenraio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NestedFrameDemo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//bottom
		driver.switchTo().frame(1);
		System.out.println(driver.getPageSource());
		
		//come back to main frame
		driver.switchTo().defaultContent();
		
		//NoSuchFrameException: no such frame
		//top
		driver.switchTo().frame(0);
		System.out.println(driver.getPageSource());
		
		//top to left
		driver.switchTo().frame("frame-left");
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println("Text is: "+text1);
		
		
		//come back to main 
		driver.switchTo().defaultContent();
		
		//top to middle
		driver.switchTo().frame(0).switchTo().frame("frame-middle");
		//driver.switchTo().frame("frame-middle");
		System.out.println(driver.getPageSource());
		
		
		//come back to main
		driver.switchTo().defaultContent();
		
		//top to right
		driver.switchTo().frame(0).switchTo().frame("frame-right");
	
		System.out.println(driver.getPageSource());
		
		
		

	}

}
