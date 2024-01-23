package newAutomationScenraio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2_Types {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement result=driver.findElement(By.id("result"));
		
		//alert1
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		
		//alert window will open
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of alert1: "+alt1.getText());
		//ok
		alt1.accept();
		//String result=driver.findElement(By.id("result")).getText();
		System.out.println("Result is: "+result.getText());
		
		
		//alert2
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		
		Alert alt2=driver.switchTo().alert();
		System.out.println("Text of Alert2: "+alt2.getText());
		
		//cancel
		alt2.dismiss();
		System.out.println("Result is: "+result.getText());
		
		
		
		//alert3
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alt3=driver.switchTo().alert();
		System.out.println("Text of Alert3 is: "+alt3.getText());
		//prompt
		alt3.sendKeys("Hello All!");
		alt3.accept();
		System.out.println("Result is: "+result.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
