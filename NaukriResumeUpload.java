package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("shubh13686@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Ss7009153644");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='ADD DETAILS']")).click();
		Thread.sleep(1000);
		File f=new File("./data/resume.docx");
		String absolutpath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absolutpath);
		driver.quit();
		
	}
}
