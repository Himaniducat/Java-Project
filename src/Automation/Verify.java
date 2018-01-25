package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.calculator.net/");
		driver.findElement(By.linkText("Math Calculators")).click();
		driver.findElement(By.linkText("Percentage Calculator")).click();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
		 String res  = driver.findElement(By.xpath("//*[@id='content']/p[2]/font/b")).getText();
		 if(res.contentEquals("2"))
			 
		 {
			 System.out.println("passed");
		 }
		 else
		 {
			 System.out.println("failed");
		 }
	}

}
