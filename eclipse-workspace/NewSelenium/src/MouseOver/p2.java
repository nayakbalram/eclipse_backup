package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement dc=driver.findElement(By.id("doubleClickBtn"));
		// We will use Actions Class for mouse over actions
		Actions a=new Actions(driver);
		// will use doubleclick method to perform double click operation
		a.doubleClick(dc).perform();
		

	}

}
