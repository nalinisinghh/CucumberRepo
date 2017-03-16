package Pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;

import objectRepo.CausalforcastScenarioLocators;

public class CausalForcastScenarioPage extends BasePage {

	public CausalForcastScenarioPage(WebDriver driver) 
	{
		super(driver);
		if(findElement(CausalforcastScenarioLocators.analysisLinktext, 5).isDisplayed())
		{
			System.out.println("analysis link text visible");
		}
		else
		{
			throw new ElementNotVisibleException("analysis link text is not visible");
		}
	}
	public void clickcausalforcastSceanrio()
	{
		findElement(CausalforcastScenarioLocators.analysisLinktext, 5).click();
		findElement(CausalforcastScenarioLocators.casualforcastlinktxt,7).click();
		if(findElement(CausalforcastScenarioLocators.pagetitle, 5).getText().trim().equalsIgnoreCase("Causal Forecast Scenario"))
		{
			System.out.println("Causal forecast scenario page display");
			
		}
		else
		{
			throw new ElementNotVisibleException("scenario page not display");
		}
		
		
	}
	

}
