package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NaukariScenario {

	public static void main(String[] args)
	{

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		List<WebElement> all=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+all.size());
		String explink="https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch";
			
		for(WebElement i:all)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			try {
			if(i.getAttribute("href").contains(explink))
			{
				System.out.println("Link found....Test pass");
				break;
			}
			}catch(NullPointerException n)
			{
				System.out.println("Href is not available");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
