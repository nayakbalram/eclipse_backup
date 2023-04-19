package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//Locate by contains
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		//Locate with starts-with
		driver.findElement(By.xpath("//input[starts-with(@type, 'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[text()='Accepted usernames are:']")).click();
		driver.findElement(By.xpath("//input[starts-with(@data-test, 'login-button')]")).click();
		
		
		

	}

}
