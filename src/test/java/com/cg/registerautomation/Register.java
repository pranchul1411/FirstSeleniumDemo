package com.cg.registerautomation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
	WebDriver driver;
	
	public Register() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void loadUrl() {
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	public void enterDetails() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Pranchul");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Jain");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Sanchi, Madhya Pradesh");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("pranchul.techi@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("+918602605990");	
		radioCheck();
		checkBox();
		langCheck();
		skill();
		country();
		selectCountry();
		selectDOB();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input")).sendKeys("123456");
		
	}
	
	public void radioCheck() {
		List<WebElement> radio = driver.findElements(By.name("radiooptions")); 
		Iterator<WebElement>  it = radio.iterator();
		while(it.hasNext()) {
			WebElement temp = it.next();
			if(temp.getAttribute("value").equals("Male")) {
				temp.click();
			}
		}
	}
	
	
	public void checkBox() {
		List<WebElement> checkbox = driver.findElements(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div//child::input")); 
		Iterator<WebElement>  it = checkbox.iterator();
		while(it.hasNext()) {
			WebElement temp = it.next();
			if(temp.getAttribute("value").equals("Movies")) {
				temp.click();
			}
		}
	}
	
	public void langCheck() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form")).click();
	}
	
	public void skill() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select/option[39]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form")).click();
	}
	
	public void country() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select/option[106]")).click();
	}
	
	public void selectCountry() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[6]")).click();
		
	}
	
	public void selectDOB() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[83]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[12]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[15]")).click();
	}
	
}

