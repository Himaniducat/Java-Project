package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://google.com");
		Actions oaction = new Actions(driver);
		oaction.sendKeys(Keys.F5).perform();
		System.out.println("done");
		WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Mc > a"));
		Thread.sleep(5000);
		oaction.clickAndHold(element).release().build().perform();
		Thread.sleep(5000);
		
		System.out.println("done");
	}

}
