package com.amazoniframe.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazoniFrameStepdef {
	
	int sleeptime = 1000;
	static WebDriver driver;
	@Given("Amazon homepage is availiable")
	public void amazon_homepage_is_availiable() {

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());
	}
	
	@When("Iframe is clicked")
	public void iframe_is_clicked() throws Exception {
		Thread.sleep(sleeptime);
		driver.switchTo().frame("frame1");
	}
	
	@Then("Iframe link should be navigated")
	public void iframe_link_should_be_navigated() throws Exception {
		Thread.sleep(sleeptime);
		driver.switchTo().defaultContent();
	}



}
