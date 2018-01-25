package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.redbus.in");
		driver.navigate().to("http://www.google.com");
		WebElement signin  = driver.findElement(By.cssSelector("#gb_70"));
		System.out.println(signin.getAttribute("id"));
		System.out.println(signin.getCssValue("font-family"));
		System.out.println(signin.getText());
		System.out.println(signin.getTagName());
		System.out.println(signin.getSize());
		System.out.println(signin.getRect());
		System.out.println(signin.getLocation());
		System.out.println(signin.isEnabled());
		System.out.println(signin.isDisplayed());
		
		
	}

}
