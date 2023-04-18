package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement dayLb = driver.findElement(By.id("day"));
		Select s1=new Select(dayLb);
		s1.selectByIndex(21);
		
		WebElement monLb = driver.findElement(By.id("month"));
		Select s2=new Select(monLb);
		s2.selectByValue("7");
		
		WebElement yearLb = driver.findElement(By.id("year"));
		Select s3=new Select(yearLb);
		s3.selectByVisibleText("1994");
		
		driver.close();
		
	}

}
