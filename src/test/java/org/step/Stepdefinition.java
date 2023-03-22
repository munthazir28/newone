package org.step;

import java.util.List;
import java.util.Map;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {
	@Given("user facebook login page")
	public void user_facebook_login_page() {
	    launchbrower();
	    launchurl("https://www.facebook.com/");
	}

	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password(DataTable d) {
		List<Map<String,String>> asMaps = d.asMaps();
		Map<String, String> map = asMaps.get(2);
		
		String email = map.get("username");
		String pass = map.get("password");
		
		
		LoginPojo l=new LoginPojo();
		filltxt(l.getEmailtxt(), email);
		filltxt(l.getPasstxt(), pass);
		
		
	    
	    
	}

	@When("user have click login button")
	public void user_have_click_login_button() {
	   WebElement login = driver.findElement(By.name("login"));
	   btnclick(login);
	}

	@Then("user should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
	   
	}

}
