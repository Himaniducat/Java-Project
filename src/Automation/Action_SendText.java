package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_SendText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=J7c8Ws6sCqry8AeT4oXoBA");
        Thread.sleep(2000);
        WebElement searchbox = driver.findElement(By.xpath("//*[@id='lst-ib']"));
        Actions oaction = new Actions(driver);
        Actions moreactions = oaction.moveToElement(searchbox).keyDown(Keys.SHIFT).sendKeys(searchbox, "selenium");
        Action enterIncaps = moreactions.build();
        enterIncaps.perform();
        System.out.println("done");
        
        
	}

}
