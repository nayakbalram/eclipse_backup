package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement ele=driver.findElement(By.id("day"));
		Select dropdown=new Select(ele);
		dropdown.selectByValue("5");
		WebElement ele2=driver.findElement(By.id("month"));
		Select dropdown2=new Select(ele2);
		dropdown2.selectByValue("2");
		WebElement ele3=driver.findElement(By.id("year"));
		Select dropdown3=new Select(ele3);
		dropdown3.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Balram");
		driver.findElement(By.name("lastname")).sendKeys("Nayak");
		driver.findElement(By.name("reg_email__")).sendKeys("bal123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bal123@gmail.com");
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
