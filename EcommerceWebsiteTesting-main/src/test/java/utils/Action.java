package utils;

import org.openqa.selenium.*;
import objectManager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Action 
{
	
	WebDriver driver;
	JavascriptExecutor exec;
	
	public Action()
	{
		this.driver=DriverManager.getDriver();
		exec = (JavascriptExecutor)driver;
	}
	//Clicking button
	public void clickButton(WebElement ele,String eleName) throws Exception
	{
			Utility.waitForElementVisibleAndClickable(driver,ele,30);
			Utility.highlightElement(driver, ele);
			ele.click();
			Logging.info("Button clicked - "+eleName);
	}
	//Entering text in text box
	public void sendKeys(WebElement ele, String testData,String eleName) throws InterruptedException
	{
			Utility.waitForVisibilityOfElement(driver,ele);
			Utility.highlightElement(driver, ele);
			ele.clear();
			ele.sendKeys(testData);
			Logging.info("Text entered - "+eleName);
	}
	//Clicking image
	public void clickImage(WebElement ele,String eleName) throws InterruptedException
	{
	     Utility.waitForVisibilityOfElement(driver,ele);
	     Utility.highlightElement(driver, ele);
	     ele.click();
	     Logging.info("Image clicked - "+eleName);
	}
	//Clicking hyperlink
	public void clickLink(WebElement ele,String eleName) throws InterruptedException
	{
	     Utility.waitForVisibilityOfElement(driver,ele);
	     Utility.highlightElement(driver, ele);
	     ele.click();
	     Logging.info("Link clicked - "+eleName);
	}
	//Button click using javaScript
	public void jsClickButton(WebElement ele,String eleName)
	{
		exec.executeScript("arguments[0].click", ele);	
		Logging.info("Button clicked - "+eleName);
	}
	//Tab press
	public void pressTab(WebElement ele)
	{
		ele.sendKeys(Keys.TAB);
		Logging.info("Tab pressed");
		Wait wait=new FluentWait(driver).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ffdg")));
	}
}