package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumException {

	public void getSalary() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getServices()));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServices()).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getWater_delivery()));
		mpf.getWater_delivery().click();
		
	}
public static void main(String[] args) {
	PracticeSeleniumException obj = new PracticeSeleniumException();
	obj.getSalary();
}
}
