package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("morgandusksword@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Farhan96");
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		if(driver.findElement(By.xpath("//*[contains(text(),' Logout')]")).isDisplayed()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
		driver.quit();
		
		}
}
