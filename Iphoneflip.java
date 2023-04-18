package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphoneflip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		List<WebElement> productName = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]/../../div[2]/div[1]/div[1]/div[1]"));
		
		int i=0;
		int j=1;
//		for(int j=0;j<productName.size();j++)
//		{
//			String text1 = productName.get(j).getText();
//			String text2 = productPrice.get(j).getText();
//			System.out.println(i+"-> "+text1+"--- "+text2);
//			i++;
//		}
		for(WebElement we:productName)
		{
			for(WebElement wer:productPrice) {
				String text1 = productName.get(i).getText();
				String text2 = productPrice.get(i).getText();
				System.out.println(j+"-> "+text1+"--- "+text2);
				i++;
				j++;
				break;
			}
			
		}
		driver.close();
	}
}
