package Zaky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zakystaging.navyuginfo.com/dashboard/news");
		driver.findElement(By.xpath("//div[text()='To whom would you like to send this message?']")).click();

	}

}
