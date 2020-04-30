package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyTestJenkins {

	public static WebDriver driver;

	@Given("^Launch chrome browser$")
	public void launch_chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Given("^Open twingo application$")
	public void open_twingo_application() throws Throwable {

		driver.get("https://twingo.techmahindra.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@When("^Get the title$")
	public void get_the_title() throws Throwable {

		System.out.println("Page Title is: " + driver.getTitle());

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {

		driver.close();
		driver.quit();

	}

}
