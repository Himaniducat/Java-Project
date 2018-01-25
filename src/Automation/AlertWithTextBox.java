package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(3) > a")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Thread.sleep(3000);
	    Alert textboxalert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    String question = textboxalert.getText();
	    System.out.println(question);
	    textboxalert.sendKeys("Hello guys");
	    Thread.sleep(2000);
	    String answer = textboxalert.getText();
	    System.out.println(answer);
	    textboxalert.accept();
	    String finalresult =driver.findElement(By.xpath("//*[@id='demo1']")).getText();
	    System.out.println(finalresult);

	}

}
