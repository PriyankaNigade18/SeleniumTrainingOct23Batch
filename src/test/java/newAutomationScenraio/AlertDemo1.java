package newAutomationScenraio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//signin
		driver.findElement(By.name("proceed")).click();
		
		//UnhandledAlertException: unexpected alert open: {Alert text : Please enter a valid user name}
		
		
		Thread.sleep(2000);
		
		//alert window
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt1.getText());
		
		//ok
		alt1.accept();
		
		
		//username
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		
		
		
		
		
		
		
		
		
		

	}

}
