package com.mazda.MXPProject.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoHomePage {

	public static void gohomePageLink(WebDriver driver, String s) {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Home")).click();
		driver.navigate().refresh();

	}

	public static void goFindaDealer(WebDriver driver, String s) {
		driver.findElement(By.linkText("Find a Dealer")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	}

	public static void goSearchbylocation(WebDriver driver, String s) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Search by location")).click();

	}

	public static void goSearchbyPostalCode(WebDriver driver, String s) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Search by postal code")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public static void goFindDealer(WebDriver driver, String s) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Find a Dealer")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).sendKeys("M5P2N7");
		driver.findElement(By.cssSelector("button.search")).click();

	}

	public static void goFindDealer1(WebDriver driver, String s) {
		driver.findElement(By.linkText("Find a Dealer")).click();	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).sendKeys("E33LP");
		driver.findElement(By.cssSelector("button.search")).click();
		
	}



}
