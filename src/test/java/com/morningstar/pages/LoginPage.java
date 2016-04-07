package com.morningstar.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebElement element = null;
	private static final Logger log = Logger.getLogger(LoginPage.class);
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement username (){
		element = driver.findElement(By.xpath(".//*[@id='username']"));
		return element;
	}
	
	public WebElement password ( ){
		element = driver.findElement(By.xpath(".//*[@id='password']"));
		return element;
	}
	
	public WebElement loginbtn ( ){
		element = driver.findElement(By.cssSelector("input#login"));
		return element;
	}
	
	 
	public void setusername(String usename){
		username().sendKeys(usename);
	}
	
	public void setpassword(String password){
		password().sendKeys(password);
	}
	
	public void clickloginbtn(){
		loginbtn().click();
	}
	
	
}