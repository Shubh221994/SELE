package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(4000);
		driver.close();

	}

}
