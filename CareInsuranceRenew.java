package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceRenew {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(month);
		s1.selectByIndex(6);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='22']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String text1="Please enter valid Policy No.";
		String text = driver.findElement(By.id("policynumberError")).getText();
		if(text.equals(text1))
			System.out.println(text+" is displayed and pass");
		else
			System.out.println(text+" is not displayed and fail");
		driver.close();
	}
}
