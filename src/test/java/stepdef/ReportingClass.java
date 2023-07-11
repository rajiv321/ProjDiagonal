package stepdef;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ReportingClass {

	
	@Before
	public  void Reporter() {
		ExtentSparkReporter EReport = new ExtentSparkReporter("Reportsdemo.html");
		ExtentReports  reports = new ExtentReports();
		reports.attachReporter(EReport);
		
		
		reports.setSystemInfo("System", "UBUNTU 20.1");
		reports.setSystemInfo("Device ", "Lenovo Thinkpad x250");
		
		
		EReport.config().setDocumentTitle("Test Report For DIAGONAL ");
		EReport.config().setTheme(Theme.STANDARD);
		EReport.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		
	}
	
	
	@After
	public void AfterReport() {
		
		
		
	}
}
