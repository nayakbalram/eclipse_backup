package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// Find source & target 
		//Source : Where we drag
		//Target: Where we drop
		WebElement source=driver.findElement(By.id("box3"));
	   WebElement target=driver.findElement(By.id("box103"));
	   Actions a= new Actions(driver);
	   a.dragAndDrop(source, target).perform();

	}

}
