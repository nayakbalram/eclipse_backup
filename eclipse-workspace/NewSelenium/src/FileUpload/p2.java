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

public class p2 {

	public static void main(String[] args) throws AWTException {
		//  We upload file with help of Robot class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		WebElement ele=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).click().perform();
		Robot r=new Robot();
		r.delay(2000);
		
		//Copy the file in clipboard
		StringSelection ss=new StringSelection("C:\\Users\\navyug\\Desktop\\Column missing.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
         //Paste the file
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	
		

	}

}
