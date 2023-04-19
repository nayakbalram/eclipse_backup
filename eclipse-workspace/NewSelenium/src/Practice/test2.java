package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//Locating using single Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		// Locating using multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Password'][@data-test='password']")).sendKeys("secret_sauce");
		//Locating using multiple attribute
		driver.findElement(By.xpath("//input[@type='submit'][@data-test='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @data-test='add-to-cart-sauce-labs-bike-light']")).click();
		
	
		

	}

}
