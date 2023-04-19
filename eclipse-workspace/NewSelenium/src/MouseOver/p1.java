package MouseOver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement ele=driver.findElement(By.id("rightClickBtn"));
		Actions rightclick=new Actions(driver);
		// We will use contextclick to perform right click
		rightclick.contextClick(ele).perform();
		

	}

}
