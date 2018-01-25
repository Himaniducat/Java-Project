package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
	    driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.cssSelector("#day"));
		WebElement month = driver.findElement(By.cssSelector("#month"));
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select oday  = new Select(day);
		Select omonth  = new Select(month); 
		Select oyear = new Select(year);
		
		oday.selectByIndex(7);
		omonth.selectByVisibleText("Aug");
		oyear.selectByVisibleText("2005");
		Thread.sleep(2000);
		
		multiple();
	 System.out.println("all elements are selected");
		

	}
	
	public static void multiple() throws InterruptedException{
	
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		 WebElement multiple  = driver.findElement(By.xpath("//*[@id='selenium_commands']"));
		 Select omulti = new Select(multiple);
		 omulti.selectByIndex(2);
		 omulti.selectByIndex(3);
		 omulti.selectByIndex(4);
		 Thread.sleep(3000);
		 omulti.deselectByIndex(4);
		 omulti.deselectByIndex(3);
         omulti.deselectByIndex(2);
         
         System.out.println(omulti.isMultiple());
		 
	

}
}
