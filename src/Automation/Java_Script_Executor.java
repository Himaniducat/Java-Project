package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java_Script_Executor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("before executing script");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");//page refresh script
		System.out.println("after executing script");
		
		Actions oaction = new Actions(driver);
		oaction.sendKeys(Keys.F5).perform();//page refresh using Action 
		System.out.println("done");
		
		WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Mc > a"));
		Thread.sleep(5000);
		oaction.clickAndHold(element).release().build().perform();//click and Hold using action
		Thread.sleep(5000);
		System.out.println("performed");
		
		js.executeScript("alert('Click and Hold Operation done');");//pop up alert using script
		driver.switchTo().alert().accept();
		System.out.println("performed");
	
		
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();//printing inner text of the webpage
		System.out.println("Inner Text of the webpage is " +sText);
		
		Thread.sleep(5000);
	      sText =  js.executeScript("return document.title;").toString();//printing document title
	      System.out.println("document title is "+sText);
	      Thread.sleep(5000);
	      
	      sText = js.executeScript("return document.domain").toString();
	      System.out.println("document domain is "+sText);
	      Thread.sleep(5000);
	      
	      sText = js.executeScript("return document.URL").toString();
	      System.out.println("document url is "+sText );
	      Thread.sleep(5000);
	      
	      js.executeScript("window.location = 'http://facebook.com'");//navigation using script
	      System.out.println("navigation done");
	      
	      driver.manage().window().maximize();
	      
	      js.executeScript("window.scrollBy(0,600)");//vertical scroll usig script
	      Thread.sleep(3000);
	      
	      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//for scrolling till the bottom of the page
	      System.out.println("vertical scroll");
	      
	      
	

}
}
