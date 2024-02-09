package testNgDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.PropertiesRead;

public class PropertiesFileDataRead {
  @Test
  public void dataRead() throws IOException
  {
//	  File f1=new File(System.getProperty("user.dir")+"//Config.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  
//	  //Properties  class
//	  Properties p1=new Properties();
//	  p1.load(fs);
//	  
//	  System.out.println("Browser name: "+p1.getProperty("bname"));
//	  System.out.println("User name is: "+p1.getProperty("un"));
	  
	  
	  PropertiesRead  p1=new PropertiesRead("Config");
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p1.getData("url"));
				
		driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
		driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
		driver.findElement(By.className("oxd-button")).click();
		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
