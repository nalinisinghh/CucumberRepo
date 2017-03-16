package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import cucumber.api.Scenario;


public class CommonFunctionLibrary {

	WebDriver driver;
	WebDriverWait wait;
	public Dimension size;

	public CommonFunctionLibrary(WebDriver driver) {

		this.driver = driver;

	}

	public boolean switchFrame(String frameId) {
		try {
			driver.switchTo().defaultContent();

			wait = new WebDriverWait(driver, 5);

			wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
			// driver.switchTo().frame(frameId);
			System.out.println(driver.getWindowHandle());
			return true;
		} catch (Exception e) {
			return false;
		}

	}

//	public void embedScreenshot(Scenario scenario) {
//		if (scenario.isFailed()) {
//			try {
//				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//				scenario.embed(screenshot, "image/png");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}

	/**
	 * This function fires events on device keys
	 * 
	 * @param key
	 * @param noOfClk
	 */
	
	public void switchToAlertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public WebElement findElement(By locator, int timeoutSeconds)
	{
		wait = new WebDriverWait(driver, timeoutSeconds);
		WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		if (elem != null) {
			return elem;
		} else {
			return null;
		}
	}

	public void switchToAlertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}

