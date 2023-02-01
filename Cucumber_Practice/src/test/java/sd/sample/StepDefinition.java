package sd.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver = null;
	
	@Given("User open the Browser and navigated")
	public void user_open_the_Browser_and_navigated() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/media/user/4682FAE282FAD581/Kiren Java with Selenium/eclipse-workpace/Cucumber/Driver/chromedriver");
		driver = new ChromeDriver();
	    driver.get("http://www.facebook.com"); 
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String username,String password) throws InterruptedException  {
	    driver.findElement(By.id("email")).sendKeys(username);  
	    driver.findElement(By.id("pass")).sendKeys(password);   
	    Thread.sleep(2000);
	}

	@When("Click the login button")
	public void click_the_login_button() throws InterruptedException {
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}

	@Then("User navigated to FB home page")
	public void user_navigated_to_FB_home_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.close(); 
	}

}
