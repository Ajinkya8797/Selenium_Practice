package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Day 1: Open Google, Print Title

public class Day_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println("Page Title: " + driver.getTitle());
		driver.quit();

	}

}
