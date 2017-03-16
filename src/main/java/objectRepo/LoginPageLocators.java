package objectRepo;

import org.openqa.selenium.By;

public class LoginPageLocators {
	public static By Fieldname=By.xpath("//td[contains(text(),'Please enter your Sign in Name and Password and click Sign in to access Servigistics.')]");
    public static By userNameTxt=By.xpath("//*[@id='txtUsername']");
    public static By passwordTxt=By.xpath("//*[@id='txtPassword']");
    public static By signinButton=By.linkText("Sign in");
    public static By homePageTxt=By.xpath("//*[@id='page-title']/h1");
    public static By errorMsg=By.xpath("//span[contains(text(),'Invalid Sign')]");
    public static By addButton=By.xpath("//a[@title='New']//span[starts-with(@class,'ui-icon')]");
}
