package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println(count);
		driver.quit();
	}
}
