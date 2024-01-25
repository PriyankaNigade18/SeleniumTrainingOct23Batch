package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		//frame
		driver.switchTo().frame("iframeResult");
		
		
		//smiley element
		WebElement img=driver.findElement(By.xpath("//img[@alt='Smiley']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(img).perform();
		System.out.println("Image mouse over is completed!");
		
		
		
		
		

	}

}
