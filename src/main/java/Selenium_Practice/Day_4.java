package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Day 4: Locators Practice (DemoQA Elements)

public class Day_4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");

		driver.findElement(By.id("item-0")).click(); // ID
		driver.findElement(By.className("header-text")).click(); // ClassName
		driver.findElement(By.xpath("//span[text()='Check Box']")).click(); // XPath
		driver.findElement(By.cssSelector("li#item-1")).click(); // CSS

		driver.quit();

	}

}
