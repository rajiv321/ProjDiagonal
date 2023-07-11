package resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.Before;

public class Driver 

{

	public static  WebDriver driver;


    static {
    	
    	ChromeOptions Chromeotpions = new ChromeOptions();
//   
//    	Chromeotpions.addPreference("media.eme.enabled",true);
//    	Chromeotpions.addPreference("media.gmp-manager.updateEnabled", true);
        driver = new  ChromeDriver(Chromeotpions);
        driver.manage().deleteAllCookies();
        
        Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        
    }
//	}
//	public void driverinit(String drivertype) {
//		if(drivertype.equalsIgnoreCase("Chrome")) {
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//		}
//		
//		if(drivertype.equalsIgnoreCase("FireFox")) {
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//		}
	}
	
	

//}
