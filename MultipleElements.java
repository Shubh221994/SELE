package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Demoo.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		WebElement link = allLinks.get(0);
		String text = link.getText();
		System.out.println(text);
		
		/*for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
			
		}*/
		driver.close();
	}

}
