package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggflipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[text()='iphone']/.."));
		int count = allsugg.size();
		System.out.println(count);
		for(WebElement i:allsugg)
		{
			System.out.println(i.getText());
		}
	
	}
	

}
