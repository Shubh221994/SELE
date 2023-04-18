package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		
		String expUrl = "https://www.selenium.dev/";
		String actUrl = driver.getCurrentUrl();
		
		if(actUrl.equals(expUrl))
		{
			System.out.println("URL is successfully navigating");
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
		
		driver.close();
	}
	

}
