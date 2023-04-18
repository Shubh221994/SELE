package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionWithoutLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLB);
		WebElement allOptions = s.getWrappedElement();
		String text = allOptions.getText();
		System.out.println(text);
		driver.close();
				
		
	
		

	}

}
