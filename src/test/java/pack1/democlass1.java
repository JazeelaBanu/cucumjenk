package pack1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class democlass1 {
   WebDriver driver;
	@Given("Testme App homepage")
	public void testme_App_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Work_Jazeela\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@Given("click on SignUp")
	public void click_on_SignUp() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Then("user enters the username {string}")
	public void user_enters_the_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		  driver.findElement(By.name("userName")).sendKeys(Keys.ENTER);
	}

	@Then("user enters the firstname {string}")
	public void user_enters_the_firstname(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@Then("user enters the lastname {string}")
	public void user_enters_the_lastname(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@Then("user enters the password {string}")
	public void user_enters_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("user enters the confirmpass {string}")
	public void user_enters_the_confirmpass(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@Then("user clicks the gender")
	public void user_clicks_the_gender() {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("user enters the email {string}")
	public void user_enters_the_email(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@Then("user enters the mobileno {string}")
	public void user_enters_the_mobileno(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@Then("user enters the DOB")
	public void user_enters_the_DOB() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]/option[4]")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]/option[21]")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();
	}

	@Then("user enters the address {string}")
	public void user_enters_the_address(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@Then("user enters the secques")
	public void user_enters_the_secques() {
		driver.findElement(By.xpath("//*[@id='securityQuestion']/option[3]")).click();
	}

	@Then("user enters the answer {string}")
	public void user_enters_the_answer(String string) {
		 driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("user clicks on Register")
	public void user_clicks_on_Register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
}
