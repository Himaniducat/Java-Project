package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Gmail")).click();
	    String url =  driver.getCurrentUrl();
	    System.out.println("The Current url of the webpage is" +url);
	    
	    driver.findElement(By.id("identifierId")).sendKeys("himanigupta591@gmail.com");
	    
	    driver.findElement(By.xpath(".//*[@id=\"identifierNext\"]/content/span")).click();
	  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(".//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("arjunangel");
	 
	    
	    driver.findElement(By.xpath(".//*[@id=\"passwordNext\"]/content/span")).click();
	    
	  
	}

}

