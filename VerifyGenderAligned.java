package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGenderAligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(4000);
		int y1 = driver.findElement(By.xpath("//label[text()='Female']/../input")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//label[text()='Male']/../input")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']/../input")).getLocation().getY();
		
		if(y1==y2 && y2==y3)
			System.out.println("Radio buttons are aligned and pass ");
		else
			System.out.println("radio buttons are not aligned and fail");
		
		driver.close();

	}

}
