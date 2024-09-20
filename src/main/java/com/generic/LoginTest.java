package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	MasterPageFactory mpf;
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(BaseConfig.getConfigValue("Url"));
		mpf = new MasterPageFactory(driver);
		Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
		mpf.getSigninbtn_homepage().click();
		Highlighter.addColor(driver, mpf.getEmail());
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		Highlighter.addColor(driver, mpf.getPassword());
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		Highlighter.addColor(driver, mpf.getSubmit());
		mpf.getSubmit().click();
		if(driver.findElement(By.xpath("//*[contains(text(),' Logout')]")).isDisplayed()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
		Screenshot.getScreenShot(driver, "Homepage_after_login");
		driver.quit();
		
		}
}
