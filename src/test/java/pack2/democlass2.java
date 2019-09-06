package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class democlass2 { 
WebDriver driver;

	@Given("Login the Testme App")
	public void login_the_Testme_App() {
		System.setProperty("webdriver.chrome.driver","C:\\Work_Jazeela\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("I enter enter the {string} in the field")
	public void i_enter_enter_the_in_the_field(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		  
		  
	}

	@Then("I enter the {string} in the field")
	public void i_enter_the_in_the_field(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}


	@And("page is displayed")
	public void page_is_displayed() {
	    
	}
}
