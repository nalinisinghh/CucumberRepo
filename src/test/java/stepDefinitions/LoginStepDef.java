package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import objectRepo.LoginPageLocators;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;
	BasePage basePage;
	HomePage homePage;
	
	@When("^PTC sevlistic page is open$")
	public void ptc_sevlistic_page_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage=new LoginPage(AttachHooks.driver);
	  
	}

	@When("^login with valid usename$")
	public void login_with_valid_usename() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enteruserName("super");
		loginPage.enterPassword("super");
	 
	}

	@Then("^User should be login$")
	public void user_should_be_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		basePage=loginPage.clickLogin();
		if(basePage.getClass().getName().equalsIgnoreCase("HomePage"))
		{
			System.out.println("home page is visible");
			homePage=(HomePage)basePage;
		}
	   
	}
	@When("^username (\\w+) entered$")
	public void username_nalini_entered(String userName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enteruserName(userName);
	    
	}

	@When("^password (\\w+) entered$")
	public void password_entered(String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterPassword(passWord);
	    loginPage.clicksignIn();
	}

	@Then("^error message should be verified$")
	public void error_message_should_be_Invalid_Sign_in_Name_or_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(loginPage.errorText().equalsIgnoreCase("Invalid Sign in Name or Password"))
		{
			System.out.println("error message verified");
			
		}
		else
		{
			Assert.fail("error message not verified");
		}
	    
	}


}
