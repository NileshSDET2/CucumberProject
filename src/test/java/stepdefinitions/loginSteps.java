package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class loginSteps {
	  @Given("I navigate to the application")
	    public void i_navigate_to_the_application() {
	        System.out.println("Navigating to the application...");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://ecommerce-playground.lambdatest.io/");
	        driver.quit();
	    }
}
