package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseAction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement target = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(target).perform();
		String etitle="HackerEarth Case Study | Vtiger CRM";
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String atitle = driver.getTitle();
			if(atitle.equals(etitle))
			{
				System.out.println("hacker earth page is displayed");
			}
			else
			{
				System.out.println("fail");
			}
		}
	}

}
