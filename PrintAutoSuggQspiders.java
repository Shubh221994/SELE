package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggQspiders {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("QSPIDERS");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count = allsugg.size();
		System.out.println(count);
		
		for(WebElement i:allsugg)
		{
			System.out.println(i.getText());
		}
		
		allsugg.get(count-1).click();
		driver.close();

	}

}
