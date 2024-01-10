package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleTitleValidation {

	/*
	 * step1: Open Google application in Browser
step2: Get the actual title from Google
step3: Compare actual versus expected title
step4: As per validation print the result
step5: close the brower
	 */
	public static void main(String[] args) 
	{

		//step1: Open Google application in Browser
		//create a session
		WebDriver driver=new ChromeDriver();
		//selenium.InvalidArgumentException: invalid argument
		//driver.get("www.google.com");
		
		driver.get("https://www.google.com");
		
		//step2: Get the actual title from Google
		String actTitle=driver.getTitle();
		System.out.println("Title is: "+actTitle);
		
		//step3: Compare actual versus expected title
		//step4: As per validation print the result
		
		if(actTitle.equals("Google"))
		{
			System.out.println("Title matched......Test Pass!");
		}else
		{
			System.out.println("Title not matched......Test Fail!");

		}
		
		//step5: close the browser
		//driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
