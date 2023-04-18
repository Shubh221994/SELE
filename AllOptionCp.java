package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionCp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		System.out.println(count);
		
		for(WebElement i:alloption)
		{
			System.out.println(i.getText());
		}
		driver.close();
	}
}
