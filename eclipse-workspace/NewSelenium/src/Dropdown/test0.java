package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement ele=driver.findElement(By.id("input-country"));
		Select dropdown =new Select(ele);
		// By selectbyvisible text 
		dropdown.selectByVisibleText("Andorra");
		Thread.sleep(2000);
		// selct by value
		dropdown.selectByValue("98");
		Thread.sleep(2000);
        //Select by index
		dropdown.selectByIndex(4);
		 if(dropdown.isMultiple()==true)
		 {
			 System.out.println("Dropdown is multiple");
		 }
		 else
		 {
			 System.out.println("Dropdown is not multiple");
		 }
		 // Getoption() will return list of webelement
		 List<WebElement>Alldropdown=dropdown.getOptions();
		 for(WebElement ele1:Alldropdown )
		 {
			 System.out.println(ele1.getText());
			 

			
		 }
		 System.out.println(Alldropdown.size());
		 driver.close();
		 
	}

}
