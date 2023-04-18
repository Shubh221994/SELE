package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statuscb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean check = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
		if(check==true)
			System.out.println("CHECKBOX SELECTED AND PASS");
		else
			System.out.println("CHECKBOX IS NOT SELECT FAIL");
	

	}

}
