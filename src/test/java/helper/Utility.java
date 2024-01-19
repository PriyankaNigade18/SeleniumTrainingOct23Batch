package helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	
	//drop down
	public static void selectBasedDropdown(WebElement dele,String value)
	{
		Select dd=new Select(dele);
		System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		
		List<WebElement> allopt=dd.getOptions();
		System.out.println("Total options are: "+allopt.size());
		
		
		for(WebElement i:allopt)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}
}
