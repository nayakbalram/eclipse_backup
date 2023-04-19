package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='text'][position()=1]")).sendKeys("def");

}
}