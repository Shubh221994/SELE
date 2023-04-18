package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {
	public static void testA(WebDriver driver)
	{
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
