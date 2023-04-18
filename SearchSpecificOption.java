package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		System.out.println("Enter the Option");
		Scanner sc=new Scanner(System.in);
		String option = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement mtrLb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLb);
		List<WebElement> allOptions = s.getOptions();
		int count=0;
		for(int i=0;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			if(text.equals(option))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(option+" is not present");
		}
		else if(count==1)
		{
			System.out.println(option+" is present without duplicates");
		}
		else if(count>1)
		{
			System.out.println(option+" is present with duplicates");
		}
		driver.close();

	}

}
