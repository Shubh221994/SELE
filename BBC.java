package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> news = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li/a/h3"));
		int i=1;
		for(WebElement we:news)
		{
			System.out.println(i +"->"+we.getText());
			i++;
		}
	}
}
