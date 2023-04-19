package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
	WebElement 	mh=driver.findElement(By.xpath("//button[@class='drawerbtn']"));
	Actions a=new Actions(driver);
	a.moveToElement(mh).perform();
	driver.findElement(By.linkText("Jackets")).click();
	}

}
