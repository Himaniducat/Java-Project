package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.calculator.net/");
		driver.findElement(By.linkText("BMI Calculator")).click();
		//driver.findElement(By.xpath("//*[@id=\"hl2\"]/li[1]/a")).click();
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("26");
		driver.findElement(By.id("csex2")).click();
		driver.findElement(By.id("cheightfeet")).clear();
		driver.findElement(By.id("cheightfeet")).sendKeys("5");
		driver.findElement(By.id("cheightinch")).clear();
		driver.findElement(By.id("cheightinch")).sendKeys("4");
		driver.findElement(By.id("cpound")).clear();
		driver.findElement(By.id("cpound")).sendKeys("115");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/table[4]/tbody/tr/td[1]/input[2]")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 String result  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/b")).getText();
		 System.out.println(result);
		 driver.close();

	}

}
