package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBocMTR {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement mtrLb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLb);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("d");
		Thread.sleep(1000);
		s.selectByVisibleText("vada");
		Thread.sleep(1000);
//		s.deselectByIndex(1);
//		Thread.sleep(1000);
//		s.deselectByValue("v");
//		Thread.sleep(1000);
//		s.deselectByVisibleText("idly");
		s.deselectAll();
		boolean status = s.isMultiple();
		System.out.println(status);
		driver.close();
	}

}
