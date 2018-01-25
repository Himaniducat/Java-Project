package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions oaction = new Actions(driver);
		oaction.dragAndDrop(drag, drop).perform();
		String text = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
		System.out.println(text);
		System.out.println("done");
		driver.quit();
		

	}

}
