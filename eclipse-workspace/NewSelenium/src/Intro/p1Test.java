package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p1Test {

  @Test
  public void mainTest() {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    String Expectedresult = "google";
    String Actualresult =driver.getTitle();
    Assert.assertEquals(Actualresult, Expectedresult);
  }
}
