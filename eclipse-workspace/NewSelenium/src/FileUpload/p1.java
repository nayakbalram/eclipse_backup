package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		// When there is type="file" format there in HTML then we will use sendkeys where we give formal argument as path 
		//driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\navyug\\Desktop");
		WebElement ele=driver.findElement(By.id("uploadFile"));
		
	   Actions a=new Actions(driver);
	   a.moveToElement(ele).click().perform();
	    
	   // when there is no type='file' attribute then we use robot class
	   Robot rb=new Robot();
	   rb.delay(2000);
	   // copy file to clipboard
	   StringSelection ss= new StringSelection("C:\\Users\\navyug\\Desktop\\Black stripe");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	   //perform control + V action to paste file
	   rb.keyPress(KeyEvent.VK_CONTROL);
	   rb.keyPress(KeyEvent.VK_V);
	   
       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);
       
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);
       

	}

}
