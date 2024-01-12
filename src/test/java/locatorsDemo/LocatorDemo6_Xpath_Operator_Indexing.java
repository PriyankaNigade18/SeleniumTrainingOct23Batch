package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_Xpath_Operator_Indexing {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//firstname using and operator
		driver.findElement(By.xpath("//input[@class='form-control' and  @name='firstname']")).sendKeys("Priyanka");
		
		//lastname using or operator
		driver.findElement(By.xpath("//input[@placeholder='Last Name' or @class='form-contro']")).sendKeys("Nigade");
		
		//email using indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("priyanka111@gmail.com");
		
		//telephone using position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("878899899");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		//yes radio button
		
		//driver.findElement(By.xpath("(//input[@value='1'])[2]")).click();
		
		/*
		 * accept both radio button if button is not selected then click on it
		 * radio or checkbox is selected====>isSelected()
		 */
		
		
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input[@type='radio']"));
		for(WebElement i:list)
		{
			if(!i.isSelected())
			{
				i.click();
				break;
			}
		}
		
		
		//checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
		
		
		
		
	}

}
