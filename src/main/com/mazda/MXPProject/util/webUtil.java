package com.mazda.MXPProject.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.mazda.MXPProject.pageObject.GoHomePage;

public class webUtil {

	public static GoHomePage goHomePage(WebDriver driver) {
		driver.get("http://www.mazda.ca");
		return PageFactory.initElements(driver, GoHomePage.class );
		
	}

}
