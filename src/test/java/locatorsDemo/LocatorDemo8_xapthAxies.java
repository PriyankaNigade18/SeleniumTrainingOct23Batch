package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_xapthAxies {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=ZXZXZX&submit-name=");

		
		//john ancenstor
		
		String text1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("For John Ancestor node is : "+text1);
		
		
		
		//john parent
		String text2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("For john parent node: "+text2);
		
		//for row2 all child node
		List<WebElement> list1=driver.findElements(By.xpath("//tbody//tr[2]//child::td"));
		
		for(WebElement i:list1)
		{
		System.out.println("For row 2 all childs node are: "+"tagname: "+i.getTagName()+"||"+"text: "+i.getText());
		}
		
		
		//who is preceding sibling of john=4
		String text3=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getText();
		System.out.println("Preceding sibling for John is: "+text3);
		
		//get all preceding node for john
		
		List<WebElement> list2=driver.findElements(By.xpath("//td[text()='John']//preceding::td"));
		
		System.out.println("All Preceding node for John are:");
		for(WebElement i:list2)
		{
			System.out.println(i.getText());
		}
		
		//who is following-sibling of John
		
		List<WebElement> list3=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		System.out.println("Total following siblings for John are: "+list3.size());
		
		for(WebElement i:list3)
		{
			System.out.println(i.getText());
		}
		
		//Total following elements for John
		int count=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Total following nodes are:  "+count);//13
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
