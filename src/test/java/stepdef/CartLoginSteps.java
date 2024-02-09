package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginSteps 
{
	WebDriver driver;
	@Given("Open OPencart login page")
	public void open_o_pencart_login_page() {
	   driver=new ChromeDriver();
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		
		List<Map<String,String>> data=table.asMaps(String.class,String.class);
		
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("pas"));

		
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("USer should be able to logon into opencart application")
	public void u_ser_should_be_able_to_logon_into_opencart_application() {
	    
	}


}
