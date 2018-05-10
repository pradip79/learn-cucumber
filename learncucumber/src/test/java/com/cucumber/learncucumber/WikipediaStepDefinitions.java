package com.cucumber.learncucumber;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import com.cucumber.learncucumber.pages.WikipediaMainPage;
import com.cucumber.learncucumber.util.CommonTasks;

public class WikipediaStepDefinitions {
	
	WebDriver driver;
	WikipediaMainPage mainPage;
	
	@Before
	public void launchBrowser(){
		driver = CommonTasks.launchBrowser();			
	}
	
	@Given("^I am on Main Page$")
	public void i_am_on_Main_Page() throws Throwable {
		CommonTasks.navigateToURL(driver, "https://en.wikipedia.org/wiki/Main_Page");
	}

	@When("^I search for country \"([^\"]*)\"$")
	public void i_search_for_country(String countryName) throws Throwable {
		mainPage = new WikipediaMainPage(driver);
		mainPage.searchItem(countryName);	    
	}

	@Then("^I verify \"([^\"]*)\" displays in the header$")
	public void i_verify_displays_in_the_header(String countryName) throws Throwable {		
	    Assert.assertEquals(countryName, mainPage.getPageHeader());
	}
	
	@After
	public void quitBrowser(){
		driver.quit();		
	}
}