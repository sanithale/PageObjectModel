package com.morningstar.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookedIteneraryPage {

	private WebDriver driver;
	public WebElement element = null;
	private static final Logger log = Logger.getLogger(BookedIteneraryPage.class);
	
	public BookedIteneraryPage(WebDriver driver) {		
		this.driver = driver;	
	}
	public WebElement desiredItenerarycheckbox (){
		element = driver.findElement(By.xpath(".//*[@value='128911']"));
		return element;
}
	public WebElement cancelItenerarybtn (){
		element = driver.findElement(By.xpath(".//*[@value='Cancel Selected']"));
		return element;
	}
	
}