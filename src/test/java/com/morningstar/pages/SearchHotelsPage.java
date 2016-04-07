package com.morningstar.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHotelsPage {

	
	
	private WebDriver driver;


	public SearchHotelsPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement element = null;
	private static final Logger log = Logger.getLogger(SearchHotelsPage.class);
	
	
	public WebElement hotellocation (WebDriver driver) {
		element = driver.findElement(By.cssSelector("select.search_combobox[name=location]"));
		return element;	
	}
	
	public WebElement adultperroom (WebDriver driver) {
		element = driver.findElement(By.cssSelector("select[name=adult_room]"));
		return element;	
	}
	
	public WebElement searchhotelbtn (WebDriver driver) {
		element = driver.findElement(By.cssSelector("input.reg_button"));
		return element;	
	}
	
	public WebElement BookedItinerarylink  () {
		element = driver.findElement(By.linkText("Booked Itinerary"));
		return element;
}
	public WebElement logoutlink (WebDriver driver) {
		element =  driver.findElement(By.linkText("Logout"));
		return element;
}
	
}