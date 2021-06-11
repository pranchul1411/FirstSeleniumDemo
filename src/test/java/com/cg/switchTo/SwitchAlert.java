package com.cg.switchTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {
	
	WebDriver driver;
	
	public SwitchAlert() {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver1.exe");
		driver = new ChromeDriver();
	}
	
	public void loadUrl() {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void handleAlert1() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert with Ok only \n"+"Alert text is " + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		handleAlert2();
	}
	
	public void handleAlert2() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert with Ok with Cancal btn \n"+"Alert text is " + alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		handleAlert3();
	}
	
	public void handleAlert3() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert with Ok with text box \n"+"Alert text is " + alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Pranchul Jain");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}
	
	public void tearDown() {
		driver.quit();
	}
	

}
