package functions;

import components.library;
import resource.Uimapper;

public class login extends library{

	public void signinbtn_click() {
		WaitUntilElementvisible(Uimapper.readPropertyFile("signinlabel"),10);
		mouseactionMoveto(Uimapper.readPropertyFile("signinlabel"));
		WaitUntilElementvisible(Uimapper.readPropertyFile("signinbtn"),10);
		clickElement(Uimapper.readPropertyFile("signinbtn"));
		validate_page_header();
	}
	
	public void enter_emailandpassword(String data, String password) {
		WaitUntilElementvisible(Uimapper.readPropertyFile("email"), 10);
		inputdata(Uimapper.readPropertyFile("email"), data);
//		clickElement(Uimapper.readPropertyFile("continue"));
		WaitUntilElementvisible(Uimapper.readPropertyFile("login_passwordinp"), 10);
		inputdata(Uimapper.readPropertyFile("login_passwordinp"), password);
		clickElement(Uimapper.readPropertyFile("signin_login_btn"));
	}
	
	public void searchHomepage_prime(String movie) {
		WaitUntilElementvisible(Uimapper.readPropertyFile("searchbox_home"), 10);
		clickElement(Uimapper.readPropertyFile("searchbox_home"));
		WaitUntilElementvisible(Uimapper.readPropertyFile("searchbox_homeinput"), 10);
		clickElement_Actions(Uimapper.readPropertyFile("searchbox_homeinput"));
		inputdata(Uimapper.readPropertyFile("searchbox_homeinput"),movie);
		EnterElement(Uimapper.readPropertyFile("searchbox_homeinput"));
		systemWait(5000);
		
	}
	
	public void playsvide() {
		
		WaitUntilElementvisible(Uimapper.readPropertyFile("movie_diana"), 10);
		clickElement_partiallinktext(Uimapper.readPropertyFile("movie_diana"));
		WaitUntilElementvisible(Uimapper.readPropertyFile("ep1_diana"), 10);
		clickElement_partiallinktext(Uimapper.readPropertyFile("ep1_diana"));
		
//		WaitUntilElementvisible("closebtn", 10);
//		mouseactionMoveto("closebtn");
		
		
	}
	
	
	public void closes_playing_video() 
	{
		systemWait(10000);
		robot_keypress_escape();
	}
	
	public void signout(String dropdown ,String signout) {
		WaitUntilElementvisible(dropdown, 20);
		clickElement_Actions(dropdown);
		WaitUntilElementinteractable(signout, 10);
		clickElement_Actions(signout);
	}
	
	
	public void closebrowser() {
		systemWait(1000);
		driver.close();
	}
	
	public void validate_playing_of_movie(String element) {
		validat_element(element);
	}
	
	
	
	
	
	
	
	
	
	
	
}
