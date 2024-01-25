package newAutomationScenraio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebDriverWait_REalScenario {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//By locator
	By startbtn=By.xpath("//button[normalize-space()='Start']");
	By text=By.xpath("//h4[normalize-space()='Hello World!']");
	
	//driver.findElement(startbtn).click();
	
	boolean statusUrl=Utility.waitForUrl(driver,"internet");
	System.out.println("Status of url is: "+statusUrl);
	
	Utility.waitForElementToClick(driver,startbtn).click();
	WebElement ele=Utility.waitForPresenceEle(driver,text);
	
	
	//String t=driver.findElement(text).getText();
	String t=ele.getText();
	System.out.println(t);
	

	}

}
