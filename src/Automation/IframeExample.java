package Automation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IframeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page");
		
		WebDriverWait wait = new WebDriverWait(driver , 50);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#IF2")));
        
        
        System.out.println("check");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='post-9']/div/div[1]/h5")));
        String text1 = element.getText();
        Assert.assertEquals("Unique & Clean", text1);
        System.out.println("Result Passed");
        driver.switchTo().defaultContent();
        String text2 = driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
        Assert.assertEquals("Sample Iframe page", text2);
        System.out.println("passed");
	}

}
