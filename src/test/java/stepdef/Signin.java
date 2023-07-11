package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import resource.Driver;
import resource.Uimapper;
import components.library.*;
import functions.login;
public class Signin extends Driver{
	

	public Signin() {
		WebDriver driver;
		driver=Driver.driver;
		
	}
//	
//	ExtentSparkReporter EReport;
//	ExtentReports  reports;
//	ExtentTest test;
//	@BeforeAll
//	public  void Reporter() {
//		
//		
//		ExtentSparkReporter EReport = new ExtentSparkReporter("Reportsdemo.html");
//		ExtentReports  reports = new ExtentReports();
//
//		reports.attachReporter(EReport);
//		
//		
//		reports.setSystemInfo("System", "UBUNTU 20.1");
//		reports.setSystemInfo("Device ", "Lenovo Thinkpad x250");
//		
//		
//		EReport.config().setDocumentTitle("Test Report For DIAGONAL ");
//		EReport.config().setTheme(Theme.STANDARD);
//		EReport.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//		
//		
//	}
//	
//	
//	@AfterAll
//	public void AfterReport() {
//		reports.flush();
//		
//		
//	}
//	
//	
//	@AfterStep
//	public void getTestResult(ITestResult result) {
//		if(result.getStatus() == ITestResult.FAILURE) {
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail",ExtentColor.RED));
//		}
//		if(result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Pass",ExtentColor.GREEN));
//		}
//		if(result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"SKIP",ExtentColor.YELLOW));
//		}
//	}
//	
//	ExtentSparkReporter EReport;
//	ExtentReports  reports;
//	ExtentTest test;
//	@BeforeAll
//	public  void Reporter() {
//		
//		
//		ExtentSparkReporter EReport = new ExtentSparkReporter("Reportsdemo.html");
//		ExtentReports  reports = new ExtentReports();
//
//		reports.attachReporter(EReport);
//		
//		
//		reports.setSystemInfo("System", "UBUNTU 20.1");
//		reports.setSystemInfo("Device ", "Lenovo Thinkpad x250");
//		
//		
//		EReport.config().setDocumentTitle("Test Report For DIAGONAL ");
//		EReport.config().setTheme(Theme.STANDARD);
//		EReport.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//		
//		
//	}
//	
//	
//	@AfterAll
//	public void AfterReport() {
//		reports.flush();
//		
//		
//	}
//	
//	
//	@AfterStep
//	public void getTestResult(ITestResult result) {
//		if(result.getStatus() == ITestResult.FAILURE) {
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail",ExtentColor.RED));
//		}
//		if(result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Pass",ExtentColor.GREEN));
//		}
//		if(result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"SKIP",ExtentColor.YELLOW));
//		}
//	}

login login = new login();

@Given("The User is on the amazonprime page in the browser")
public void the_user_is_on_the_login_page_in_the_browser() {
	driver.get(Uimapper.readPropertyFile("URL"));
    driver.manage().window().maximize();
   
}



@When("The User Clicks on the Signin button")
public void the_user_clicks_on_the_signin_button() {
	login.signinbtn_click();

}
@Then("The User should be able to redirect to the login page")
public void the_user_should_be_able_to_redirect_to_the_login_page() {
    
}
@Then("The User Enters {string} and {string} and click on the login button")
public void the_user_enters_and_and_click_on_the_login_button(String string, String string2) {
   login.enter_emailandpassword(string,string2);
   
}
@Then("The User should be redirected to the amazon prime home page")
public void the_user_should_be_redirected_to_the_amazon_prime_home_page() {
  
}
@Then("The user searched the {string} in the search box")
public void the_user_searched_the_in_the_search_box(String string) {
	
	login.searchHomepage_prime(string);
   
}
@Then("The user clicks on the movie")
public void the_user_clicks_on_the_movie() {
    login.playsvide();
}
@Then("The user validated that the movie is been played")
public void the_user_validated_that_the_movie_is_been_played() {
    
	login.validate_playing_of_movie(Uimapper.readPropertyFile("seekbtn"));
}


@Then("The user closes the video")
public void the_user_closes_the_video() {
   login.closes_playing_video();
}

@Then("The user clicks signout")
public void the_user_clicks_signout() {
   login.signout(Uimapper.readPropertyFile("signinlabel"), Uimapper.readPropertyFile("signout"));
}

@Then("The user closes the browser")
public void the_user_closes_the_browser() {
  login.closebrowser();
}



    
}


	
