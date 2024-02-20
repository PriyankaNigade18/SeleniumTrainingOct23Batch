package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps
{
	WebDriver driver;

	@Given("Open Amazon home page")
	public void open_amazon_home_page() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.amazon.in");
	}

	@When("User capture current title of homepage")
	public void user_capture_current_title_of_homepage() {
	    	System.out.println("Title is: "+driver.getTitle());
	}

	@Then("Title should matched with homepage title")
	public void title_should_matched_with_homepage_title() {
	    
		Assert.assertTrue(driver.getTitle().contains("India"),"Title not matched!");
		System.out.println("Home page title is matched!");
	}

	@When("user open bestsellers page")
	public void user_open_bestsellers_page() {
	    driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']")).click();
	}

	@When("User capture current title of bestSellers")
	public void user_capture_current_title_of_best_sellers() {
	   System.out.println("Title is: "+driver.getTitle());
	}

	@Then("title should match with BestSellers page title")
	public void title_should_match_with_best_sellers_page_title() {
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title not matched!");
		System.out.println("Best Sellers title is matched!");
	}

	@When("user open mobiles page")
	public void user_open_mobiles_page() {
	    driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
	}

	@When("User capture current title of mobiles")
	public void user_capture_current_title_of_mobiles()
	{
		System.out.println("Title is: "+driver.getTitle());
	}

	@Then("title should match with mobiles page title")
	public void title_should_match_with_mobiles_page_title() {
		Assert.assertTrue(driver.getTitle().contains("Phones"),"Title not matched!");
		System.out.println("Mobiles title is matched!");
	}

	@When("user open todays deal page")
	public void user_open_todays_deal_page() {
	   driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("User capture current title of todays deal")
	public void user_capture_current_title_of_todays_deal() {
	    System.out.println("Title is: "+driver.getTitle());
	}

	@Then("title should match with todays deal page title")
	public void title_should_match_with_todays_deal_page_title() {
		Assert.assertTrue(driver.getTitle().contains("Deals"),"Title not matched!");
		System.out.println("Todays deal title is matched!");
	}
}
