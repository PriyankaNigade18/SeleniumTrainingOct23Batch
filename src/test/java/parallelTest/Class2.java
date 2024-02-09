package parallelTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	  public void edgeTest() 
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println("Title is: "+driver.getTitle());
	  }
}
