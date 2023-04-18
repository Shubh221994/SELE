package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateLB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs=new HashSet<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/menu.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
	    List<WebElement> alloption = s.getOptions();
	    for(int i=0;i<alloption.size();i++)
	    {
	    	String text = alloption.get(i).getText();
	    	hs.add(text);
	    }
			//System.out.println(hs);
	    for(String option:hs)
	    {
	    	System.out.println(option);
	    }
	    driver.close();
	   
		
	}
}
