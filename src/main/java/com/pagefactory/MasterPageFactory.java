package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[text()='Bottled Water Delivery'])[2]")
	private WebElement water_delivery;
	
	public WebElement getWater_delivery() {
		return water_delivery;
	}
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement oldMenu;
	
	public WebElement getOldMenu() {
		return oldMenu;
	}
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement signinbtn_homepage;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
		private WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	private WebElement submit;
	
	public WebElement getServices() {
		return services;
	}

	@FindBy(xpath="(//*[text()='Services'])[3]")
	private WebElement services;
	@FindBy(xpath="//*[@class='btn btn-danger']")
	private WebElement alertbtn;
	
		public WebElement getAlertbtn() {
		return alertbtn;
	}

		public WebElement getSubmit() {
		return submit;
	}

		public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

		public WebElement getSigninbtn_homepage(){
			return signinbtn_homepage;
			
	}
}
