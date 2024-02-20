package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetup;
import hooksDemo.CRMHooks;
import io.cucumber.java.en.*;

public class CRMSteps 
{
	//WebDriver driver;

	public WebDriver driver=BrowserSetup.getDriver();
@Given("Open Crm application")
public void open_crm_application() {
    
//	driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://automationplayground.com/crm/");
	
}

@When("user click on SignIn link")
public void user_click_on_sign_in_link() {
    driver.findElement(By.id("SignIn")).click();
}

@Then("SignIn page should open")
public void sign_in_page_should_open()
{
	Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Test fail");
    
	System.out.println("Page open ...Test Pass!");
	
}

@When("user enter email {string} and password {string}")
public void user_enter_email_and_password(String email, String psw) {
    driver.findElement(By.id("email-id")).sendKeys(email);
    driver.findElement(By.id("password")).sendKeys(psw);
}

@When("user click on submit button")
public void user_click_on_submit_button()
{
    driver.findElement(By.id("submit-id")).click();
}

@Then("for valid data user should be able to login")
public void for_valid_data_user_should_be_able_to_login()
{
	Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Fail");
    
	System.out.println("Login Pass!");
}


}
