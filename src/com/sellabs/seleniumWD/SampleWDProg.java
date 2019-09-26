/**
 * 
 */
package com.sellabs.seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * @author Manjit
 *
 */
public class SampleWDProg {
	
	public void ops(){
		
	try {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		WebElement search = driver.findElement(By.id("q"));
		search.clear();
		search.sendKeys("selenium");
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Documentation")).click();
		Thread.sleep(3000);
		String expTitle = "Selenium Documentation — Selenium Documentation";
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		driver.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
		SampleWDProg sw = new SampleWDProg();
		sw.ops();
	}

}
