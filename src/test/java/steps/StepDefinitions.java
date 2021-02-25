package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinitions {
	private WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://github.com/bonigarcia/webdrivermanager-examples");
	    Thread.sleep(10000);
	}
	
	@Then("I validate the outcomes e entrar no youtube")
	public void i_validate_the_outcomes_e_entrar_no_youtube() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String site = "https://www.youtube.com/";
		site = System.getProperty("siteUrl","https://www.youtube.com/watch?v=aTv32EyGVMU");
	    driver.get(site);
	    Thread.sleep(10000);
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(true);
		driver.quit();
	}
}

