package com.cg.navigate;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
	
	WebDriver driver;
	WebElement img; 
	String Url = "https://www.google.co.in/imghp?hl=en&tab=ri&ogbl";
	
	public NavigateExample() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver1.exe");
		driver = new ChromeDriver();
	}
	
	public void loadUrl() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	public void clickImages() throws InterruptedException {
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
	}
	
	public void moveBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void checkImage() {
		System.out.println("Google logo displayed?? "+driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	public void moveForward() throws InterruptedException {
		driver.navigate().forward();
		Thread.sleep(3000);
	}
	
	public void navigate() throws InterruptedException {
//		driver.navigate().to("https://www.google.co.in/imghp?hl=en&tab=ri&ogbl");
		driver.navigate().to(Url);
		Thread.sleep(3000);
		
	}

}
