package stepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.CommonFunctionLibrary;
import utils.ConfigManager;

public class AttachHooks  {
public static WebDriver driver;
CommonFunctionLibrary functionLibrary;



@Before
public void setUp()
{
	System.out.println("Cucu");
	System.out.println("inside hook method");
	ConfigManager.loadConfig();
	if(ConfigManager.getProperty("ExecutionPlatform").equalsIgnoreCase("web"))
	{
		if(ConfigManager.getProperty("browserName").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if (ConfigManager.getProperty("browserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
	}
		driver.get(ConfigManager.getProperty("EnvironmentURL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
}
	functionLibrary=new CommonFunctionLibrary(driver);
}
@After
public void tearDown() throws InstantiationException, IllegalAccessException {
 if (ConfigManager.getProperty("ExecutionPlatform").equalsIgnoreCase("web"))
 {

		driver.quit();
	}
     
}}
