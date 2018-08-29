package com.cucumber.learncucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaMainPage {
	private WebDriver driver;    

	public WikipediaMainPage(WebDriver driver){
		this.driver = driver;
	}	

	//Lets add some comment
	public void searchItem(String searchItem) {
		WebElement searchField = driver.findElement(By.id("searchInput"));
		WebElement searchButton = driver.findElement(By.id("searchButton"));		
		searchField.sendKeys(searchItem);
		searchButton.click();		
	}
	
	public String getPageHeader(){
		WebElement pageHeader = driver.findElement(By.id("firstHeading"));
		return pageHeader.getText();
	}

}
