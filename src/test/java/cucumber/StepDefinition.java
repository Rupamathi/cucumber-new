package cucumber;

import static org.junit.Assert.assertTrue;

import java.util.List;

import base.BaseClass;
import base.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	 BaseClass b = new BaseClass();
	 ObjectRepository o = new ObjectRepository();
	
/*@Given("launch url {string}")
 public void launch_url(String url) {
	 WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	    
	   
	 }*/
	 

@Given("the user is on the login page")
public void theUserIsOnTheLoginPage() {
   
	b.gpage("https://www.gmail.com");
    b.press(o.getSigin());
}

@When("the user inputs the correct email address onedim list")
public void the_user_inputs_the_correct_email_address_onedim_list(io.cucumber.datatable.DataTable dataTable) throws Throwable {
	
	List<String> asList = dataTable.asList();
    String user = asList.get(0);	 
	b.text(o.getId(), user);
    System.out.println(user);
    b.time();
    b.press(o.getNext());
}
@And("the user inputs the correct password")
public void the_user_inputs_the_correct_password() throws Throwable {
	
	b.time();
    b.text(o.getPass(), "rupamathi007");
   
}
@And("the user clicks the Login button")
public void theUserClicksTheLoginButton() {
	 b.press(o.getNext());
}

@Then("the user should be authenticated")
public void theUserShouldBeAuthenticated() throws Throwable {
	b.time();
   b.print(o.getStep());
  
}

@Then("the user should be presented with a success message")
public void theUserShouldBePresentedWithASuccessMessage() {
	b.display(o.getCompose());
	b.condition(true);
	b.press(o.getCompose());
   
}
@Given("I am in facebook login page")
public void i_am_in_facebook_login_page() {
	
	b.fpage("https://www.facebook.com");
    
}

@When("I enter unvalid username as {string}")
public void i_enter_unvalid_username_as(String userId) {
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	b.text(user, userId);
}
@And("I enter the unvalid password {string}")
public void iEnterTheUnvalidPassword(String password)  throws Throwable {

   b.time();
   WebElement enter = driver.findElement(By.xpath("//input[@type='password']"));
  b.text(enter, password);

   
}

@Then("I should not be redirected to the home page of facebook")
public void i_should_not_be_redirected_to_the_home_page_of_facebook() throws Throwable {
	b.time();
	WebElement log = driver.findElement(By.xpath("//button[text()='Log in']"));
	b.press(log);

    
}








}
