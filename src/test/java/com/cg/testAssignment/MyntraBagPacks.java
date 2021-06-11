package com.cg.testAssignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraBagPacks {
	
	WebDriver driver;
	WebElement men,bags;
	Actions action;
	ChromeOptions options;
	
	public MyntraBagPacks() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver1.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		action = new Actions(driver);
	}
	
	public void loadUrl() {
		driver.get("https://www.myntra.com/men-bags-backpacks");
		driver.manage().window().maximize();
	}

	public void BagPacks() throws InterruptedException {
		men = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a"));
		action.moveToElement(men).perform();
		Thread.sleep(2000);
		bags = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[14]/a"));
		action.moveToElement(bags).click().perform();
		Thread.sleep(2000);
		checkBoxCategories();
//		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[2]/ul[1]/li[3]/label[1]")).click();
	}
	
	public void checkBoxCategories() {
		List<WebElement> list = driver.findElements(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[2]/ul[1]//child::li"));
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext()) {
			WebElement temp = it.next();
			if(temp.getText().contains("Trolley Bag")) {
				temp.click();
			}
		}
		
	}
}
