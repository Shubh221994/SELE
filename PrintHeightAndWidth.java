package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int h1 = driver.findElement(By.id("email")).getSize().getHeight();
		int w1 = driver.findElement(By.id("email")).getSize().getHeight();
		System.out.println("height of un textbox "+h1);
		System.out.println("width of un textbox "+w1);
		
		int h2 = driver.findElement(By.id("passContainer")).getSize().getHeight();
		int w2 = driver.findElement(By.id("passContainer")).getSize().getHeight();
		System.out.println("height of pwd textbox "+h2);
		System.out.println("width of ped textbox "+w2);
		
		
		driver.close();

	}

}
