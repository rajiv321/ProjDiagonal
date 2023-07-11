package components;



import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import resource.Driver;
import resource.Uimapper;

public class library extends Driver{

//	public library() {
//		WebDriver driver;
//		driver=Driver.driver;
//	}

	
	
	public static void clickElement(String element){
		driver.findElement(By.xpath(element)).click();;
	}
	
	public static void mouseactionMoveto(String element) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(element))).build().perform();
		
	}
	
	public static void WaitUntilElementvisible(String element,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));
			
		}
		catch (InvalidSelectorException e) {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(element)));
		}
		
	}
	
	
	public static void WaitUntilElementinteractable(String element ,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}

	public static void validate_page_header() {
//		SoftAssert softAssert = new SoftAssert();
		Assert.assertTrue(Uimapper.readPropertyFile("signinPageTitle").equalsIgnoreCase(driver.getTitle()));
		
	}

	public static void inputdata(String element , String data) {
		driver.findElement(By.xpath(element)).sendKeys(data);
	}
	
	public static void clickElement_Actions(String element) {
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath(element))).build().perform();
	}
	
	public static void EnterElement(String element) {
		driver.findElement(By.xpath(element)).sendKeys(Keys.ENTER);
	}
	
	public static void systemWait(long seconds)
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clickElement_partiallinktext(String element) {
		driver.findElement(By.partialLinkText(element)).click();
	}
	
	public static void robot_keypress_escape() {
		
		 Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ESCAPE);	
		
	}
	
	public static void validat_element(String element) {
		WebElement elements = driver.findElement(By.xpath(element));
		if(element!= null) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
}
