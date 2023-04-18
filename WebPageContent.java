package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageContent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/table.html");
		List<WebElement> allsugg = driver.findElements(By.xpath("//td"));
		for(WebElement i:allsugg)
		{
			System.out.println(i.getText());
		}
		driver.close();
	}
	
}
