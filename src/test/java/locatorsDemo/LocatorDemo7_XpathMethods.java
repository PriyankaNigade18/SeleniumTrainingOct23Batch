package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathMethods {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//text()
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();

		//contains() with text()
		//String text1=driver.findElement(By.xpath("//h2[text()='Bestsellers in Jewellery']")).getText();
		String text1=driver.findElement(By.xpath("(//h2[contains(text(),'Bestsellers')])[1]")).getText();
		System.out.println(text1);
		
		//cart
		
		WebElement ele1=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
		System.out.println("Cart option text is: "+ele1.getText());
		ele1.click();
		
		
		//normalize-space()
		String text2=driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text2);
		
		
		//contains()
		
		//starts-with()
		
		
		
		
		
		
		
	}

}
