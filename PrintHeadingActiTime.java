package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeadingActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String title = "actiTIME Online Terms of Service";
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String text = driver.getTitle();
			//System.out.println(text);
			if(text.contains(title))
			{
				Thread.sleep(2000);
				List<WebElement> listHeader = driver.findElements(By.xpath("//h2"));
//				for(int i=0;i<listHeader.size();i++)
//				{
//					String t = listHeader.get(i).getText();
//					System.out.println(t);
//				}
				for(WebElement i:listHeader)
				{
					Thread.sleep(2000);
					System.out.println(i.getText());
				}
				
			}
			
		}
	}
}
