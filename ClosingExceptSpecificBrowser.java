package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingExceptSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title of the browser");
		String eTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			String aTitle = driver.getTitle();
			
			if(aTitle.equalsIgnoreCase(eTitle))
			{
			}
			else {
				driver.close();
			}
		}
	}
}
