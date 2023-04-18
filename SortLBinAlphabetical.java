package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortLBinAlphabetical {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static <T> void main(String[] args) throws InterruptedException {
		ArrayList<String> al=new ArrayList<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloption = s.getOptions();
		for(int i=0;i<alloption.size();i++)
		{
			String text = alloption.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(String option:al)
		{
			System.out.println(option);
		}
		driver.close();
		
	}
}
