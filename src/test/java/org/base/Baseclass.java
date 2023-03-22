package org.base;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	
	public static void launchbrower() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

	}
	public static void launchurl(String e) {
		driver.get(e);

	}
	public static void filltxt(WebElement a,String e) {
		a.sendKeys(e);

	}
	public static void btnclick(WebElement a) {
		a.click();

	}
	public static void browserclose() {
		driver.close();

	}
	public static String currenturl() {
	 String Url = driver.getCurrentUrl();
	return Url;

	}
	public static String title() {
		String title = driver.getTitle();
		return title;

	}
	public static void datetimem() {
		Date d=new Date();

	}
	

}
