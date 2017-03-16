package Pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.junit.*;

import objectRepo.LoginPageLocators;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		if(isElementPresent(LoginPageLocators.userNameTxt, 5))
		{
			System.out.println("user name text box is present");
		}
		else
		{
			throw new ElementNotVisibleException("user name text box is not present");
		}
	}
	public void enteruserName(String username)
	{
		sendKeys(LoginPageLocators.userNameTxt, username);
	}
	public void enterPassword(String password)
	{
		sendKeys(LoginPageLocators.passwordTxt, password);
	}
	public BasePage clickLogin()
	{
		if(isElementPresent(LoginPageLocators.signinButton, 10))
		{
			findElement(LoginPageLocators.signinButton, 10).click();
		}
		if(findElement(LoginPageLocators.homePageTxt, 5).getText().equalsIgnoreCase("Home Page"))
		{
			return new HomePage(driver);
		}
		else
		{
			return null;
		}
	}
	public String errorText()
	{
		String errorTxt=findElement(LoginPageLocators.errorMsg, 10).getText();
		return errorTxt;
	}
	public void clicksignIn()
	{
		if(isElementPresent(LoginPageLocators.signinButton, 10))
		{
			findElement(LoginPageLocators.signinButton, 10).click();
		}
	}
    
}
