package Zaky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zakystaging.navyuginfo.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("email")).sendKeys("balram.nayak+05666@navyuginfo.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.name("isChecked")).click();
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//driver.findElement(By.xpath("//*[text()='Back']")).click();

		driver.findElement(By.className("MuiButton-label")).click();
        driver.findElement(By.partialLinkText("Contest Dashboard")).click();
        driver.get("http://zakystaging.navyuginfo.com/dashboard/news");
		driver.findElement(By.xpath("//div[text()='To whom would you like to send this message?']")).click();

		
		
		
		
		
		

		

	}

}
