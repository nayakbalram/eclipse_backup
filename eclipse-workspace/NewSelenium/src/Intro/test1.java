package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	@Test
	 public void m1()
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 String Expectedresult = "google";
		    String Actualresult =driver.getTitle();
		    Assert.assertEquals(Actualresult, Expectedresult);
	 }
	 
	   

}
